import java.util.ArrayList;

class ChatApp {
    private ArrayList<User> users;

    public ChatApp() {
        this.users = new ArrayList<User>();
    }

    private User findUser(String userName) {
        for (User user : users) {
            if (user.getUserName().equals(userName)) {
                return user;
            }
        }
        return null;
    }

    public void addUser(String userName) {
        users.add(new User(userName));
    }

    public void sendMessage(String senderName, String receiverName, String messageContent) {
        User sender = findUser(senderName);
        if (sender == null) {
            addUser(senderName);
            sender = findUser(senderName);
        }

        User receiver = findUser(receiverName);
        if (receiver == null) {
            addUser(receiverName);
            receiver = findUser(receiverName);
        }

        Message message = new Message(senderName, receiverName, messageContent);

        sender.addMessage(message);
        receiver.addMessage(message);
    }

    public void displayUserMessages(String userName) {
        User user = findUser(userName);
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
