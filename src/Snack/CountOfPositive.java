package Snack;

import java.util.Scanner;

public class CountOfPositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String i;
        do {
            System.out.println("Enter positive number");
            int positive = input.nextInt();
            System.out.println("Enter negative number");
            int negative = input.nextInt();
            System.out.println(positive + negative);

            System.out.println("Enter yes to continue and No to stop");
            i = input.next();
        }while (i.equals("yes"));
    }
}
