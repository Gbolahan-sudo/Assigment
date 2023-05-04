package Snack;


import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter your height in inches: ");
        double heightInInches = input.nextDouble();

        double weightInKilograms = weightInPounds * 0.45359237;
        double heightInMeters = heightInInches * 0.0254;

        double bmi = weightInKilograms / Math.pow(heightInMeters, 2);

        System.out.printf("Your BMI is %.2f", bmi);
    }
}