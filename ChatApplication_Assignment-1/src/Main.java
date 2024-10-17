import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChatApp chatApp = new ChatApp();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        // Pre-existing users and messages
        chatApp.sendMessage("Alice", "Bob", "Hello Bob!");
        chatApp.sendMessage("Bob", "Alice", "Hi Alice, how are you?");
        chatApp.sendMessage("Alice", "Charlie", "Hey Charlie!");
        chatApp.sendMessage("Charlie", "Alice", "Hey Alice, what's up?");
        chatApp.sendMessage("Bob", "Charlie", "Hey Charlie, long time!");

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
            for (int i = 0; i < chatApp.getUsers().size(); i++) {
                System.out.println((i + 1) + ". " + chatApp.getUsers().get(i).getUserName());
            }
        }
    }

    private static void sendMessage(ChatApp chatApp, Scanner scanner) {
        displayUsers(chatApp);

        System.out.println("Would you like to add a new user to send a message to? (yes/no)");
        String response = scanner.nextLine().trim().toLowerCase();

        String receiverName;

        if (response.equals("yes")) {
            System.out.print("Enter the new Receiver's name: ");
            receiverName = scanner.nextLine();
            chatApp.addUser(receiverName);
        } else {
            System.out.print("Enter the number of the user to send a message to: ");
            int userNumber = scanner.nextInt();
            scanner.nextLine();

            if (userNumber <= 0 || userNumber > chatApp.getUsers().size()) {
                System.out.println("Invalid user number!");
                return;
            }

            receiverName = chatApp.getUsers().get(userNumber - 1).getUserName();
        }

        System.out.print("Enter the sender's name: ");
        String senderName = scanner.nextLine();

        System.out.print("Enter the message content: ");
        String messageContent = scanner.nextLine();

        chatApp.sendMessage(senderName, receiverName, messageContent);
        System.out.println("Message sent from " + senderName + " to " + receiverName);
    }

    private static void viewUserMessages(ChatApp chatApp, Scanner scanner) {
        displayUsers(chatApp);

        System.out.print("Enter the number of the user to view messages: ");
        int userNumber = scanner.nextInt();
        scanner.nextLine();

        if (userNumber <= 0 || userNumber > chatApp.getUsers().size()) {
            System.out.println("Invalid user number!");
        } else {
            String userName = chatApp.getUsers().get(userNumber - 1).getUserName();
            chatApp.displayUserMessages(userName);
        }
    }
}
