package seminars.sem2;

import java.util.Scanner;
import java.lang.Math;

public class Exercises {
    public static void main(String[] args) {

        // Задача 4
        //String day;
        Scanner input = new Scanner(System.in);

        //System.out.println("Input day: ");
        //day = input.nextLine();

        //if (day.equalsIgnoreCase("Monday")  || day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Thursday")|| day.equalsIgnoreCase("Friday")) {
            //System.out.println("Working day");
        //} else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            //System.out.println("Weekend");
        //} else {
            //System.out.println("Error");
        //}

        // Задача 8
        //int n;
        //Scanner input = new Scanner(System.in);
        //System.out.println("Input n: ");
        //n = input.nextInt();
    
        //for(int i = n; i >= 1; i--) {
            //System.out.println(i);
        //}

        // Задача 15
        
        //System.out.println("Input hour (0-23): ");
        //int hour = input.nextInt(); 

        //System.out.println("Input minutes (0-59): ");
        //int minutes = input.nextInt();

        //if (hour < 0 || hour > 23 || minutes < 0 || minutes > 59) {
            //System.out.println("Invalid input");
            //return;
        //}

        //int totalMinutes = hour * 60 + minutes;

        //int minutesToAdd = 15;
        //int newTotalMinutes = totalMinutes + minutesToAdd;

        //int newMinutes = newTotalMinutes % 60;
        //int newHours = (newTotalMinutes / 60) % 24;

        //String resultTime = String.format("%d:%02d", newHours, newMinutes);

        //System.out.println("\nTime: " + resultTime);


        // Задача 16

        //int number;
        //System.err.print("Enter your number: ");
        //number = input.nextInt();

        //if (number >= 1 && number % 5 == 0) {
            //System.out.println("Valid");
        //} else {
            //System.err.println("Invalid!");
        //}

        // Задача 17

        int N = input.nextInt();
        int K = input.nextInt();

        if (K <= 1 || K >= N) {
            return;
        }

        long result = 1;

        for (int i = K + 1; i <= N; i++) {
            result *= i;
        }

        System.out.println(result);
    

        // Задача 18

        // Задача 19
        //System.out.print("Budget for film: ");
        //double budgetFilm = input.nextDouble();

        //System.out.print("Number people: ");
        //int people = input.nextInt();

        //System.out.print("Price for outfits: ");
        //double priceOutf = input.nextDouble();

        //double decor = 0.1*budgetFilm;
        //double totalOutfitsCost = people * priceOutf;

        //if (people > 150) {
            //totalOutfitsCost = 0.9 * totalOutfitsCost;
        //}

        //double totalExpenses = decor + totalOutfitsCost;

        //if (totalExpenses > budgetFilm) {
            //System.out.println("Not enough money!");
            //System.out.printf("Wingard needs %.2f leva more.\n", totalExpenses - budgetFilm);
        //} else {
            //System.out.println("Action!");
            //System.out.printf("Wingard starts filming with %.2f leva left.\n", budgetFilm - totalExpenses);
        //}


        // Задача 20

        //String figureType = input.nextLine();
        //double area = 0.0;

        //switch (figureType) {
            //case "square":
                //double side = input.nextDouble();
                //area = side * side;
                //break;
            //case "rectangle":
                //double sideA = input.nextDouble();
                //double sideB = input.nextDouble();
                //area = sideA * sideB;
                //break;
            //case "circle":
                //double radius = input.nextDouble();
                //area = Math.PI * radius * radius;
                //break;
            //case "triangle":
                //double base = input.nextDouble();
                //double height = input.nextDouble();
                //area = (base * height) / 2;
                //break;
            //default:
                //System.out.println("Невалиден вид фигура.");
                //input.close();
                //return;
        }

        //System.out.printf("%.3f%n", area)
    }

}
