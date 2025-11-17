package seminars.sem3.FactoryPattern;

public class SMSMessage implements Message{
    private String phoneNumber;
    private String content;

    public SMSMessage(String phoneNumber, String content) {
        this.phoneNumber = phoneNumber;
        this.content = content;
    }

    @Override
    public void send() {
        System.out.println("Send SMS to: " + phoneNumber);
        System.out.println("Content: '" + content);
    }
}
