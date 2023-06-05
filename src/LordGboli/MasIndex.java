package LordGboli;

import java.util.Scanner;

public class MasIndex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in KG");
        double weight = input.nextDouble();
        System.out.println("Enter height in meters");
        double height = input.nextDouble();
        double bmi = weight / (height * height );
        System.out.println("Bmi is now in pound: "+ bmi);

    }
}
