package labs.lab2.Car;

import java.util.Arrays;
import java.util.Comparator;

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

    public static Car[] sortedCarsByBrand(Car [] cars) {
        if (cars == null || cars.length <= 1) return cars;

        Car[] sortedCars = Arrays.copyOf(cars, cars.length); // Копие на масива

        Comparator<Car> brandComparator = Comparator.comparing(Car::getBrand);

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

        for (int i = 0; i < cars.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {

            }
        }
    }
    public static void main(String[] args) {
        
    }
}
