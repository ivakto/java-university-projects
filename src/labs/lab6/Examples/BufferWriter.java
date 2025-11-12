package labs.lab6.Examples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
    public static void main(String[] args) {
        String filePath = "buffered_output.txt";
        
        try (BufferedWriter buffWriter = new BufferedWriter(new FileWriter(filePath, true))) { 
            // 'true' във FileWriter(..., true) означава добавяне (append), а не презаписване
            
            buffWriter.write("Първи ред, записан с буфер.");
            buffWriter.newLine(); // Добавя системен знак за нов ред (\n)
            
            buffWriter.write("Втори ред. Чака във вътрешния буфер.");
            
            // Методът flush() принуждава всички данни в буфера да бъдат записани на диска веднага.
            // При затваряне на потока (края на try-with-resources) flush() се извиква автоматично, 
            // но ръчното извикване е полезно при дълги операции.
            buffWriter.flush(); 
            
            buffWriter.write("Трети ред, след flush.");
            
            System.out.println("Записът е приключил. Файлът '" + filePath + "' е създаден/обновен.");
        } catch (IOException e) {
            System.err.println("Грешка при записване с буфер:");
            e.printStackTrace();
        }
    }
}
