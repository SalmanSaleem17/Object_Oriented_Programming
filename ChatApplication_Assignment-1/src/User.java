import java.util.ArrayList;

class User {
    private String userName;
    private long contactNumber;
    private ArrayList<Message> messages;

    public User(String userName, long contactNumber) {
        this.userName = userName;
        this.contactNumber = contactNumber;
        this.messages = new ArrayList<Message>();
    }

    public String getUserName() {
        return userName;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    public void displayMessages() {
        System.out.println("Messages for " + userName + " (Contact: " + contactNumber + "):");
        if (messages.isEmpty()) {
            System.out.println("No messages.");
        } else {
            for (Message message : messages) {
                message.displayMessage();
            }
        }
    }
}
