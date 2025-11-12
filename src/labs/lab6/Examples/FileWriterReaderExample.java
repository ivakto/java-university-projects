package labs.lab6.Examples;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriterReaderExample {
    public static void main(String[] args) {
        String fileName = "my_text_file.txt";
        String textToWrite = "This is example for writing in Java!\n";

        // 1. Писане
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(textToWrite);
        } catch (IOException e) {
            System.err.println("Error when writing!");
            e.printStackTrace();
            return; // Спираме, ако писането се провали
        }

        // 2. Четене
        try (FileReader reader = new FileReader(fileName)) {
            int charCode; // Ще държи Unicode стойността на прочетения символ

            while ((charCode = reader.read()) != -1) {
                System.out.println((char) charCode); // // Конвертираме обратно към символ
            }
        } catch (IOException e) {
            System.err.println("Error!");
            e.printStackTrace();
        }
    }
}
