package LordGboli;

import java.util.Scanner;

public class PlayGround {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String yourName = input.nextLine();
        System.out.println("Enter cohort number");
        int cohortNumber = input.nextInt();
        System.out.println("Enter Month number");
        int monthNumber = input.nextInt();
        System.out.println("Here is your result " +yourName + " " + cohortNumber * monthNumber);
    }
}
