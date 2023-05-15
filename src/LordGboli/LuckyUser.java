package LordGboli;

import java.util.Scanner;

public class LuckyUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        if (number == 5) {
            System.out.println("It is a lucky number");

        } else if (number < 5) {
            System.out.println("Not a lucky number");
        }while (number != 5){
            System.out.println("try again");
             number = input.nextInt();
            if (number == 5){
                System.out.println("well Done");
            }
        }
    }
}

