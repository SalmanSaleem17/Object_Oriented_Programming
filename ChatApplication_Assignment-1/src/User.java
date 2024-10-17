import java.util.ArrayList;

class User {
    private String userName;
    private ArrayList<Message> messages;

    public User(String userName) {
        this.userName = userName;
        this.messages = new ArrayList<Message>();
    }

    public String getUserName() {
        return userName;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    public void displayMessages() {
        System.out.println("Messages for " + userName + ":");
        for (Message message : messages) {
            message.displayMessage();
        }
    }
}
