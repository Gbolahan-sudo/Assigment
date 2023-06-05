package LordGboli;

import java.util.Scanner;
public class Number2 {
    public static void main(String[] args) {
        numbers();
    }
    public static void numbers(){
            Scanner input = new Scanner(System.in);
            for (int counter = 0; counter < 5; counter++) {
                System.out.print("Enter a number: ");
                int number = input.nextInt();
                System.out.print(number);
        }
    }
}