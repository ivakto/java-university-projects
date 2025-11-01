package labs.lab1;

import java.util.Scanner;

public class BMICalculator {
         
    public void printIntroduction() {
        System.out.println("Welcome to the BMI (Body Mass Index) Calculator!");
        System.out.println("This program calculates your BMI based on your weight");
        System.out.println("in pounds (lbs) and height in inches (in).");
        System.out.println("It then provides a weight status (underweight, normal, etc.).");
    }

    private double bmiFor(double weightInPounds, double heightInInches) {
        return (weightInPounds * 703) / (heightInInches * heightInInches);
    }

    public double getBMI(Scanner console) {
        System.out.print("Please enter your height in centimeters (cm): ");
        double heightCM = console.nextDouble();
        double heightInInches = heightCM * 0.3937;
        
        System.out.print("Please enter your weight in kilograms (kg): ");
        double weightKG = console.nextDouble();
        double weightInPounds = weightKG * 2.2046;
        
        return bmiFor(weightInPounds, heightInInches);
    }

    public String getStatus(double bmi) {
        if (bmi <= 18.5) {
            return "underweight";
        } else if (bmi <= 25) {
            return "normal";
        } else if (bmi <= 30) {
            return "overweight";
        } else {
            return "obese";
        }
    }

    public void reportResults(int personNumber, double bmi, String status) {
        double roundedToTwoDecimals = Math.round(bmi * 100.0) / 100.0;
        
        System.out.printf("Result for Person #%d:%n", personNumber);
        System.out.printf("  -> BMI = %.2f%n", roundedToTwoDecimals);
        System.out.printf("  -> Status: %s%n", status);

    }

     public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        BMICalculator calculator = new BMICalculator();
        
        calculator.printIntroduction();
        
        double finalBMI = calculator.getBMI(console);
        
        String statusResult = calculator.getStatus(finalBMI);
        
        calculator.reportResults(1, finalBMI, statusResult);
        
        console.close();
    }
    
}
