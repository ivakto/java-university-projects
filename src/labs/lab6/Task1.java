package labs.lab6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
   public static void main(String[] args) {
        String line = null;

        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Input text: ");
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (line != null) {
            line = line.replaceAll("new", "old");
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt", true))) {
            bw.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


// Задача 1, 4, 9