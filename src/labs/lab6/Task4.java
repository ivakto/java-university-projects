package labs.lab6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {
        // Програма, която използва регулярни изрази, за да намери и изведе всички думи в текстов файл, 
        // започващи с определен префикс
        String inputFile = "src/file1.txt"; 
        String prefix = "app";    

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            System.out.println("Words starting with " + prefix + ":");

            while ((line = br.readLine()) != null) {

                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.startsWith(prefix)) {
                        System.out.println(word);
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Error!");
        }
    }
}
