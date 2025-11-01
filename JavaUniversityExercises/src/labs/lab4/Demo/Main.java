package labs.lab4.Demo;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 0));
            System.out.println("After exception.");
        } catch (DivideByZero e) {
            e.printStackTrace();
        }

        System.out.println("After try/catch.");
        
    }

    private static double divide(double a, double b) throws DivideByZero {
        if (b == 0) {
            throw new DivideByZero("Cannot divide by zero.");
        }
        return a/b;
    }
}
