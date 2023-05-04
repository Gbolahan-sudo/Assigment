import java.util.Scanner;

public class Bmi{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter float 1: ");
        float f1 = input.nextFloat();

        System.out.print("Enter float 2: ");
        float f2 = input.nextFloat();

        float bmi = (f1 / f2);

        System.out.println("The body max index is " + bmi);


    }
}
