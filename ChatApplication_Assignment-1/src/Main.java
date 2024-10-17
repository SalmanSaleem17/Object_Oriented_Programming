import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChatApp chatApp = new ChatApp();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        // Pre-existing users and messages
        chatApp.addUser("Alice", 12345678901L);
        chatApp.addUser("Bob", 12345678902L);
        chatApp.addUser("Charlie", 12345678903L);

        chatApp.sendMessage(12345678901L, 12345678902L, "Hello Bob!");
        chatApp.sendMessage(12345678902L, 12345678901L, "Hi Alice, how are you?");
        chatApp.sendMessage(12345678901L, 12345678903L, "Hey Charlie!");

        // Main loop
        while (!exit) {
            System.out.println("\n================================");
            System.out.println("Welcome to the Chat Application!");
            System.out.println("1. Display all users");
            System.out.println("2. Send a message");
            System.out.println("3. View a user's messages");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayUsers(chatApp);
                    break;

                case 2:
                    sendMessage(chatApp, scanner);
                    break;

                case 3:
                    viewUserMessages(chatApp, scanner);
                    break;

                case 4:
                    System.out.println("Exiting the chat application. Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    private static void displayUsers(ChatApp chatApp) {
        if (chatApp.getUsers().isEmpty()) {
            System.out.println("No users available.");
        } else {
            System.out.println("Available users:");
            for (User user : chatApp.getUsers()) {
                System.out.println("User: " + user.getUserName() + ", Contact: " + user.getContactNumber());
            }
        }
    }

    private static void sendMessage(ChatApp chatApp, Scanner scanner) {
        displayUsers(chatApp);

        System.out.print("Would you like to add a new user to send a message to? (yes/no) : ");
        String response = scanner.nextLine().trim().toLowerCase();

        long receiverContact;
        if (response.equals("yes")) {
            System.out.print("Enter the new Sender's name: ");
            String receiverName = scanner.nextLine();

            System.out.print("Enter the new Receiver's 11-digit contact number: ");
            receiverContact = scanner.nextLong();
            scanner.nextLine();

            chatApp.addUser(receiverName, receiverContact);
        } else {
            System.out.print("Enter the 11-digit contact number of the Sender to send a message to: ");
            receiverContact = scanner.nextLong();
            scanner.nextLine();
        }

        System.out.print("Enter your 11-digit contact number: ");
        long senderContact = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Enter the message content: ");
        String messageContent = scanner.nextLine();

        chatApp.sendMessage(senderContact, receiverContact, messageContent);
        System.out.println("Message sent!");
    }

    private static void viewUserMessages(ChatApp chatApp, Scanner scanner) {
        displayUsers(chatApp);

        System.out.print("Enter the 11-digit contact number of the user to view messages: ");
        long contactNumber = scanner.nextLong();
        scanner.nextLine();

        chatApp.displayUserMessages(contactNumber);
    }
}
