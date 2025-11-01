package labs.lab4.Task1;


public class Main {
     static void main(String[] args) {
        try {
            StudentFactory.createStudent("Iva", "0908");
            System.out.println("After exception:");

        }catch (FacultyNumberValidation | NameValidationExeption | NullException e){
            e.printStackTrace();
        }
        System.out.println("After try/catch");
    }

}

