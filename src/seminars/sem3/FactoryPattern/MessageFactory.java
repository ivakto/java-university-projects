package seminars.sem3.FactoryPattern;

public class MessageFactory {

    public static Message createMessage(String type, String recipient, String content) {
        if (type == null || type.isEmpty()) {
            return null;
        }

        switch (type.toUpperCase()) {
            case "EMAIL":
                return new EmailMessage(recipient, content);
            case "SMS":
                return new SMSMessage(recipient, content); 
            case "PUSH":
                return new PushNotification(recipient, content); 
            default:
                throw new IllegalArgumentException("Невалиден тип съобщение: " + type);
        }
    }
}
