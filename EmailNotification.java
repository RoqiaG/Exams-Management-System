package patternproject;

public class EmailNotification extends Notification{

    public EmailNotification(String Message) {
        super(Message);
    }

    @Override
    void send() {
        System.out.println("sent by email");
    }
    
    
}
