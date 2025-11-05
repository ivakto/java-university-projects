package labs.lab2.Car;

import java.util.Objects; 

public class Car {
    private String brand;
    private String model;
    private String color;
    private double power;
    private String engine;
    private String gearbox;
    private String date;


    public Car() {
        this.brand = "";
        this.model = "";
        this.color = "";
        this.power = 0.00;
        this.engine = "";
        this.gearbox = "";
        this.date = "";
    }

    public Car(String brand, String model, String color, double power, String engine, String gearbox, String date) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.power = power;
        this.engine = engine;
        this.gearbox = gearbox;
        this.date = date;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;

        return Double.compare(power, car.power) == 0 &&
               Objects.equals(brand, car.brand) &&
               Objects.equals(model, car.model) &&
               Objects.equals(color, car.color) &&
               Objects.equals(engine, car.engine) &&
               Objects.equals(gearbox, car.gearbox) &&
               Objects.equals(date, car.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, power, engine, gearbox, date);
    }

}