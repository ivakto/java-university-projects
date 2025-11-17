package seminars.sem3.FactoryPattern;

public class PushNotification implements Message{
    private String device;
    private String title;

    public PushNotification(String device, String title) {
        this.device = device;
        this.title = title;
    }

    @Override
    public void send() {
        System.out.println("Send SMS to: " + device);
        System.out.println("Content: '" + title);
    }
}
