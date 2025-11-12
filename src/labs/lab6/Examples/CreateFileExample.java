package labs.lab6.Examples;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {

    // Задача 1 - Един вариант да създадем файл е като работим с класа File. 
    // Той съдържа няколко метода за достъп и работа с файлове. 
    // Интересува ни конкретно createNewFile(). 
    // Той създава нов празен файл, ако такъв не съществува и връща true, ако всичко е наред при създаването. 
    // Нека да създадем един файл:
    public static void main(String[] args) {
       try {
        File file = new File("C:\\newfile.txt");
        boolean isCreated = file.createNewFile();
        if (isCreated) {
            System.out.println("File has been created successfully");
        } else {
            System.out.println("File already present at the specified location");
        }
    } catch (IOException e) {
        System.out.println("Exception Occurred:");
        e.printStackTrace();
    } 
    }

}

