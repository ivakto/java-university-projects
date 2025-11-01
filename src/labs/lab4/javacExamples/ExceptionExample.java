package labs.lab4.javacExamples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        int number = 0;
        boolean result = false;

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter an integer:");
                number = scanner.nextInt();
                System.out.println(division(100, number));
                result = true;
            } catch (InputMismatchException e) {
                System.out.println("You didn't enter integer!");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }

        } while (!result);
    }
    public static int division(int a, int b) {
        return a/b;
    }
}
