package LordGboli;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int counter = 1; counter < 6; counter++) {
            System.out.println("Enter a number");
            int number = input.nextInt();
            sum = number + sum;
        }
        System.out.println(sum);

    }
}
