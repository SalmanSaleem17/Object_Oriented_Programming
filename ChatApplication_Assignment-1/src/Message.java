import java.text.SimpleDateFormat;
import java.util.Date;

class Message {
    private static int idCounter = 1;
    private int messageID;
    private String sender;
    private String receiver;
    private String messageContent;
    private String dateTime;

    public Message(String sender, String receiver, String messageContent) {
        this.messageID = generateMessageID();
        this.sender = sender;
        this.receiver = receiver;
        this.messageContent = messageContent;
        this.dateTime = getCurrentDateTime();
    }

    private synchronized int generateMessageID() {
        return idCounter++;
    }

    public int getMessageID() {
        return messageID;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void displayMessage() {
        System.out.println("-------------------------------");
        System.out.println("MessageID: " + messageID);
        System.out.println("From: " + sender + " To: " + receiver);
        System.out.println("Message: " + messageContent);
        System.out.println("Date & Time: " + dateTime);
        System.out.println("-------------------------------");
    }

    private String getCurrentDateTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return formatter.format(date);
    }
}
