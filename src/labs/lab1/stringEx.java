package labs.lab1;

import java.util.Scanner;

public class stringEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] stringArray = new String[5];

        System.out.println("Input 5 strings: ");
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = input.next();
        }

        input.close();

        for (String element: stringArray) {
            System.out.println(element);
        }
    }
}
