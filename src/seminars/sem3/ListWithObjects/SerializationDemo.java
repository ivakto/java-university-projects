package seminars.sem3.ListWithObjects;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        Book book = new Book("Author", "BookName");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.ser"))) {
            oos.writeObject(book);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
