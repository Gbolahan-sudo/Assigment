package LordGboli;

import java.util.Scanner;

public class FirstAndSecond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number1");
        int number1 = input.nextInt();
        System.out.println("Enter a number2");
        int number2 = input.nextInt();
        System.out.println("Enter a number3");
        int number3 = input.nextInt();
        System.out.println("Enter a number4");
        int number4 = input.nextInt();
        System.out.println("Enter a number5");
        int number5 = input.nextInt();
        System.out.println(number1 + number2 + number3 + number4 + number5);
        int sum = number1 & number5;
        System.out.println(sum);
    }
}