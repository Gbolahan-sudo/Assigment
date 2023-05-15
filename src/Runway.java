import java.util.Scanner;

public class Runway{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed: ");
        double v = input.nextDouble();

        System.out.print("Enter acceleration: ");
        double a = input.nextDouble();

        double length = Math.sqrt(v) / (2 * a);

        System.out.print("The minimum runway length for this airplane is " + length);


    }

}

