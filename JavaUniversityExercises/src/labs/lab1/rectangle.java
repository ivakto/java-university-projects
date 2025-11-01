package labs.lab1;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, input a: ");
        int a = input.nextInt();

        input.nextLine();

        System.out.print("Please, input b: ");
        int b = input.nextInt();

        input.nextLine();

        int area = a * b;

        System.out.println("Area: " + area);
        input.close();
    }
}
