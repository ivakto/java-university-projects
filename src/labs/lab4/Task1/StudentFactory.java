package labs.lab4.Task1;

public class StudentFactory {

    public static Student createStudent(String name, String facultyNumber) throws FacultyNumberValidation ,NullException, NameValidationExeption{
        if(name==null|| facultyNumber==null){
            throw new NullException("Name should not be empty");
        }
        else if(facultyNumber.length()>10 || facultyNumber.length()<10){
            throw new FacultyNumberValidation("Fculty number should be 10 characters");
        }
        else if(Character.isUpperCase(name.charAt(0))){
            throw new NameValidationExeption("Name should start with upper case");
        }else{

            Student student=new Student(name, facultyNumber);

            return student;
        }

    }
}

