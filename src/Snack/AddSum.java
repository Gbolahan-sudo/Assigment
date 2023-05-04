package Snack;

import java.util.Scanner;

public class AddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String i;
        do {
            System.out.println("Enter a number 1");
            int num1 = input.nextInt();
            System.out.println("Enter a number 2");
            int num2 = input.nextInt();
            System.out.println(num1 + num2);

            System.out.println("Do you wish to continue");
            i = input.next();
        } while (i.equals("yes"));
    }
}