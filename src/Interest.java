import java.util.Scanner;

public class Interest{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance rate");
        double balance = input.nextDouble();

        System.out.print("Enter annual rate");
        double annual = input.nextDouble();

        double interest = balance * (annual / 1200);

        System.out.println("The interest is" + interest);

    }

}
