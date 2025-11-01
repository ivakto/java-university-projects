package labs.lab3.Area;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        Area circle = new Circle(5.0f);          
        Area rectangle = new Rectangle(4.0f, 6.0f); 

        System.out.printf("Площ на кръга (радиус 5): %.2f%n", circle.calculate());
        System.out.printf("Площ на правоъгълника (4x6): %.2f%n", rectangle.calculate());
        
        System.out.println("-------------------------");

        List<Area> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(new Rectangle(3.0f, 7.0f));

        float totalArea = 0;
        
        for (Area shape : shapes) {
            float area = shape.calculate();
            System.out.printf("Изчислена площ: %.2f%n", area);
            totalArea += area;
        }
        
        System.out.println("-------------------------");
        System.out.printf("Обща площ на всички фигури: %.2f%n", totalArea);
    }
}


