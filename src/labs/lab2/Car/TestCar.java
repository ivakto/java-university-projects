package labs.lab2.Car;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class TestCar {

    public static Car[] filterCarsByBrand (Car [] cars, char letter) {
        if (cars == null) {
            return new Car[0];
        }

        int count = 0;
        char upperCaseLetter = Character.toUpperCase(letter);
        for (Car car : cars) {
            if (car != null && car.getBrand() != null && !car.getBrand().isEmpty()) {
                if (Character.toUpperCase(car.getBrand().charAt(0)) == upperCaseLetter) {
                    count++;
                }
            }
        }

        Car[] filteredCars = new Car[count];
        int newIndex = 0; 

        for (Car car : cars) {
            if (car != null && car.getBrand() != null && !car.getBrand().isEmpty()) {
                if (Character.toUpperCase(car.getBrand().charAt(0)) == upperCaseLetter) {
                    filteredCars[newIndex] = car;
                    newIndex++; 
                }
            }
        }
        return filteredCars;
    }

    public static Car[] sortedCarsByBrand(Car [] cars, String order) {
        if (cars == null || cars.length <= 1) return cars;

        Car[] sortedCars = Arrays.copyOf(cars, cars.length); 

        Comparator<Car> brandComparator = Comparator.comparing(
            Car::getBrand, 
            Comparator.nullsFirst(String::compareToIgnoreCase) 
        );

        if ("desc".equalsIgnoreCase(order)) { 
            Arrays.sort(sortedCars, brandComparator.reversed());
        } else { 
            Arrays.sort(sortedCars, brandComparator);
        }

        return sortedCars;
    }

    public static Car[] filterCarsRepeated(Car[] cars) { 
        if (cars == null) {
            return new Car[0];
        }

        Set<Car> uniqueCars = new HashSet<>();
        for (Car car : cars) {
            if (car != null) {
                uniqueCars.add(car);
            }
        }

        return uniqueCars.toArray(new Car[uniqueCars.size()]);
    }

    public static void main(String[] args) {
        Car c1 = new Car("BMW", "X5", "Black", 300.0, "Diesel", "Auto", "2020");
        Car c2 = new Car("Audi", "A4", "Red", 150.0, "Gasoline", "Manual", "2018");
        Car c3 = new Car("BMW", "X5", "Black", 300.0, "Diesel", "Auto", "2020"); // Дубликат на c1
        Car c4 = new Car("Mercedes", "C200", "White", 180.0, "Hybrid", "Auto", "2022");
        Car c5 = new Car("Audi", "Q7", "Blue", 250.0, "Diesel", "Auto", "2021");

        Car[] originalCars = {c1, c2, c3, c4, c5, null};
        
        System.out.println("--- Филтър по буква 'A' ---");
        Car[] filtered = filterCarsByBrand(originalCars, 'A');
        System.out.println(Arrays.toString(filtered)); 

        System.out.println("\n--- Сортиране по марка (DESC) ---");
        Car[] sortedDesc = sortedCarsByBrand(originalCars, "desc");
        System.out.println(Arrays.toString(sortedDesc));

        System.out.println("\n--- Премахване на дубликати ---");
        Car[] unique = filterCarsRepeated(originalCars);
        System.out.println(Arrays.toString(unique)); 
    }
}