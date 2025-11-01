package labs.lab4.javacExamples;

public class FinallyExample {
    public static void main(String[] args) {
        int array[] = new int[5];

        try {
            System.out.println(array[7]);
        } catch (ArrayIndexOutOfBoundsException е) {
            System.out.println("Enter a valid index.");
        } finally {
            System.out.println("This will print ever.");
        }
    }
}
