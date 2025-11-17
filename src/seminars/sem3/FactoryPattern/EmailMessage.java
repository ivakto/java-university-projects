package seminars.sem3.FactoryPattern;

public class EmailMessage implements Message{
    private String recipient;
    private String content;

    public EmailMessage(String recipient, String content) {
        this.recipient = recipient;
        this.content = content;
    }

    @Override
    public void send() {
        System.out.println("Sends email to: " + recipient);
        System.out.println("Content: '" + content + "'");
    }
}
