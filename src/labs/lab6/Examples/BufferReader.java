package labs.lab6.Examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
    public static void main(String[] args) {
        String filePath = "my_text_file.txt"; // Използваме файла от предишната задача

        System.out.println("Четене на файла ред по ред:");
        
        // try-with-resources автоматично затваря BufferedReader-а (и вътрешния FileReader)
        try (BufferedReader buffReader = new BufferedReader(new FileReader(filePath))) {
            
            String line;
            int lineNumber = 1;
            
            // readLine() връща целия ред като String или null, ако е достигнат краят на файла
            while ((line = buffReader.readLine()) != null) {
                System.out.println("Ред " + lineNumber + ": " + line);
                lineNumber++;
            }

        } catch (IOException e) {
            System.err.println("Възникна грешка при четене на файла:");
            e.printStackTrace();
        }
    }
}
