package seminars.sem4.Student;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;

public class MainApp {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("Иван", 20, 5.50),
            new Student("Мария", 22, 4.25),
            new Student("Георги", 21, 6.00),
            new Student("Елена", 19, 3.50),
            new Student("Петър", 20, 5.80)
        );

        System.out.println("Начални данни");
        students.forEach(System.out::println);
        System.out.println("---------------------\n");
        
        // Задача 1: Среден успех
        OptionalDouble avg = StudentStatics.getAverageGrade(students);
        System.out.println("1. Среден успех: " 
            + (avg.isPresent() ? String.format("%.2f", avg.getAsDouble()) : "Няма данни"));

        // Задача 2: Разделяне по успех
        double passGrade = 4.00;
        Map<Boolean, List<Student>> partitioned = StudentStatics.partitionByPass(students, passGrade);
        System.out.println("\n2. Разделяне по успех (праг: " + String.format("%.2f", passGrade) + "):");
        System.out.println("Положили (True): " + partitioned.get(true));
        System.out.println("Неположили (False): " + partitioned.get(false));

        // Задача 3: Студенти над средния успех
        System.out.println("\n3. Студенти с оценка над средната:");
        StudentStatics.printNamesAboveAverage(students);
    }
}
