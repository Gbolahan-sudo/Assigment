package Snack;

import java.util.Scanner;

public class UserInteger {
    public static void main(String[] ags){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a non negative integer");
        int number = input.nextInt();
        primeNumber(number);

    }
    public static void primeNumber(int number) {
        int count = 1;
        int primeCount = 0;
        while (count <= number) {
            if (number % count == 0) {
                primeCount++;
            }
          count++;
        }
        if (primeCount == 2) {
            System.out.println(number + " is a prime number");
        }
        else {
            System.out.println(number + " is not a prime number");
        }
    }
}
