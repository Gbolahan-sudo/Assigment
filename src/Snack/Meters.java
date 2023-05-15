package Snack;

import java.util.Scanner;

public class Meters {
    //main method to run my code
    public static void main(String[] args) {

        //to receive input
        Scanner input = new Scanner(System.in);

        //output message/prompt
        System.out.print("Enter a value for feet: ");

        //stores the value received for feet
        double feetValue = input.nextDouble();

        //convert the value of feet to meter and save in
        double meterValue = feetValue * 0.305;

        //print out the result
        System.out.print(feetValue + " feet is " + meterValue + "meters");


    }
}