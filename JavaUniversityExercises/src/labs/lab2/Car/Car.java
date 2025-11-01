package labs.lab2.Car;

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

        
}
