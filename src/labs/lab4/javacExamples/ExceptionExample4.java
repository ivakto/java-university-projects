package labs.lab4.javacExamples;

import java.util.Scanner;

public class ExceptionExample4 {
    public static void main(String[] args) {
        try {
            readPriceTv();
        } catch (PriceErrorException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int readPriceTv() throws PriceErrorException{
        Scanner scanner = new Scanner(System.in);

        int userPrice = scanner.nextInt();
        if (userPrice > 500 || userPrice < 100) {
            throw new PriceErrorException();
        }
        return userPrice;
    }

    public static class PriceErrorException extends Exception {
        // constructor without param
        public PriceErrorException() {
            super(); 
        }

        @Override
        public String getMessage() {
            return "Invalid price!";
        }
    }

}
