package labs.lab4.javacExamples;

public class ExceptionExample3 {
    public static void main(String[] args) {
        
        try {
            division (100, 9);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        }
    }

    public static void division(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        } else {
            int c = a/b;
            System.out.println(c);
        }
    }
}
