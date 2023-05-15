package LordGboli;

import java.util.Scanner;

public class NumAndName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name and your num");
        String yourName = input.nextLine();
        int yourNum = input.nextInt();
        System.out.print("Your name is " + yourName + " " + yourNum);



    }
}

