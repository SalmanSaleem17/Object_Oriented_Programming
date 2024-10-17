import java.util.ArrayList;

class ChatApp {
    private ArrayList<User> users;

    public ChatApp() {
        this.users = new ArrayList<User>();
    }

    private User findUserByContact(long contactNumber) {
        for (User user : users) {
            if (user.getContactNumber() == contactNumber) {
                return user;
            }
        }
        return null;
    }

    public void addUser(String userName, long contactNumber) {
        if (findUserByContact(contactNumber) == null) {
            users.add(new User(userName, contactNumber));
        } else {
            System.out.println("A user with this contact number already exists!");
        }
    }

    public void sendMessage(long senderContact, long receiverContact, String messageContent) {
        User sender = findUserByContact(senderContact);
        User receiver = findUserByContact(receiverContact);

        if (sender == null) {
            System.out.println("Sender not found!");
            return;
        }
        if (receiver == null) {
            System.out.println("Receiver not found!");
            return;
        }

        Message message = new Message(sender.getUserName(), receiver.getUserName(), messageContent);
        sender.addMessage(message);
        receiver.addMessage(message);
    }

    public void displayUserMessages(long contactNumber) {
        User user = findUserByContact(contactNumber);
        if (user != null) {
            user.displayMessages();
        } else {
            System.out.println("User not found.");
        }
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
