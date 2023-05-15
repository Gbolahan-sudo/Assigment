package Snack;

import java.util.Scanner;

public class Kilogram{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter pound: ");
        double pound = input.nextDouble();

        double kilogram = pound * 0.454F;

        System.out.println(pound +" pounds is " + kilogram + " kilograms");



    }


}
