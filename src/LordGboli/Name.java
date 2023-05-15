package LordGboli;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        if (number == 5) {
            System.out.println("it is a lucky ");
        } else if (number <= 5){
            System.out.println("Try again");
        }
        System.out.println("Enter number");
        while (number != 5){
            System.out.println("not a GOOd number");
            number = input.nextInt();
            System.out.println("Nice try");
        }

    }

}

