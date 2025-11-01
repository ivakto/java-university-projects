package labs.lab4.javacExamples;

public class ExceptionExample2 {
    public static void main(String[] args) {
        try {
            division(100, 0);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero.");
        }
    }

    public static void division(int a, int b) throws ArithmeticException {
        int c = a / b;
        System.out.println(c);
    }
}
