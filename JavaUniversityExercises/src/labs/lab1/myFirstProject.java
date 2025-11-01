package labs.lab1;

import java.util.Scanner;

public class myFirstProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input your name: ");
        String name = input.nextLine();

        System.out.print("Input your age: "); 
        int age = input.nextInt();

        input.nextLine(); // След int или double добавяме нов допълнителен ред

        System.out.print("Input your birth date: ");
        String dateBirth = input.nextLine();

        System.out.println("Name: " + name + ", Age: " + age + ", Birthday: " + dateBirth);

        input.close(); // Винаги затваряме scannera
    }
}
