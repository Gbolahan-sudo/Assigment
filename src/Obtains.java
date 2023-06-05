import java.util.Scanner;

public class Obtains {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int firstNum = input.nextInt();
        System.out.println("Enter another integer");
        int secondNum = input.nextInt();
        int sqrt1 = (firstNum * firstNum);
        int sqrt2 = (secondNum * secondNum);
        System.out.println("This is the sqrt of first num: "+ sqrt1);
        System.out.println("This is the sqrt of second num: "+ sqrt2);
        int addition = sqrt1 + sqrt2;
        System.out.println("This is the sum of both sqrt: "+ addition);
        int subtraction = sqrt1 - sqrt2;
        System.out.println("This is subtraction of both sqrt is: "+ subtraction);

    }
}
