package seminars.sem4.Student;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.Comparator;

public class StudentStatics {

    public static OptionalDouble getAverageGrade(List<Student> students) {
        return students.stream()
                       .mapToDouble(Student::getGrade) 
                       .average();                      
    }

    public static Map<Boolean, List<Student>> partitionByPass(
            List<Student> students, 
            double passGrade) {
                
        return students.stream()
                       .collect(Collectors.partitioningBy(
                           student -> student.getGrade() >= passGrade
                       ));
    }

    public static void printNamesAboveAverage(List<Student> students) {
        double averageGrade = students.stream()
                                      .mapToDouble(Student::getGrade)
                                      .average()
                                      .orElse(0.0);
        
        System.out.println("Средна оценка: " + String.format("%.2f", averageGrade));
        System.out.println("Студенти с оценка над средната (сортирани по име):");

        students.stream()
                .filter(student -> student.getGrade() > averageGrade) 
                .sorted(Comparator.comparing(Student::getName))
                .map(Student::getName) 
                .forEach(System.out::println);
    }
}