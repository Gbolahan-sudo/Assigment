package tdd;


import java.util.Scanner;

public class Driller {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many copies do you want to make?");
        int answer = input.nextInt();
        Driller driller = new Driller();
        driller.amount(answer);
    }

    public static double amount(int copy) {
        double price = 1100;
        if (copy >= 500) {
            price = 1000.0;
        } else if (copy >= 200 && copy < 499) {
            price = 1100.0;
        } else if (copy >= 100 && copy < 200) {
            price = 1200.0;
        } else if (copy >= 50 && copy < 100) {
            price = 1300;
        } else if (copy >= 30 && copy < 50) {
            price = 1500;
        } else if (copy >= 10 && copy < 30) {
            price = 1600.0;
        } else if (copy >= 5 && copy < 10) {
            price = 1800.0;
        } else if (copy >= 1 && copy <= 5) {
            price = 2000.0;
        }
        return price;
    }
//
//
//    public double price(int copy) {
//        double price = 0.0;
//        if (copy >= 1 && copy <= 4) {
//            price = 2000.00;
//        } else if (copy < 4 || copy >= 9) {
//            price = 1800.00;
//        } else if (copy > 9 || copy <= 29) {
//            price = 1600.00;
//        } else if (copy > 29 || copy <= 49) {
//            price = 1500.00;
//        } else if (copy > 49 || copy <= 99) {
//            price = 1300.00;
//        } else if (copy > 99 || copy <= 199) {
//            price = 1200.00;
//        } else if (copy > 199 || copy <= 499) {
//            price = 1100.00;
//        } else if (copy > 499) {
//            price = 1000.00;
//        }
//        return price;
//    }
}