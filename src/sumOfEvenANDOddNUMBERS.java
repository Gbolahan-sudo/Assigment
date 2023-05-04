import java.util.Scanner;

public class sumOfEvenANDOddNUMBERS {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Entern the first input: ");
        int firstInput = input.nextInt();

        System.out.println("Enrter the second input: ");
        int scondInput = input.nextInt();

        System.out.println("Enter the third input: ");
        int thirdInput = input.nextInt();

        System.out.println("Enter the fourth input: ");
        int fourthInput = input.nextInt();

        System.out.println("Enter the fifth input: ");
        int fifthInput = input.nextInt();

        System.out.println("Enter the sixth input: ");
        int sixthInput = input.nextInt();


        int even1 = 0;
        int even2 = 0;
        int even3 = 0;
        int even4 = 0;
        int even5 = 0;
        int even6 = 0;

        int odd1 = 0;
        int odd2 = 0;
        int odd3 = 0;
        int odd4 = 0;
        int odd5 = 0;
        int odd6 = 0;

        if(firstInput % 2 == 0){
            even1 = firstInput;
        }
        else {
            odd1 = firstInput;
        }

        if (scondInput % 2 == 0){
            even2 = scondInput;
        }
        else {
            odd2 = scondInput;
        }

        if (thirdInput % 2 == 0){
            even3 = thirdInput;
        }
        else {
            odd3 = thirdInput;
        }

        if (fourthInput % 2 == 0){
            even4 = fourthInput;
        }
        else {
            odd4 = fourthInput;
        }

        if (fifthInput % 2 == 0){
            even5 = fifthInput;
        }

        else {
            odd5 = fifthInput;
        }

        if( sixthInput % 2 == 0){
            even6 = sixthInput;
        }
        else {
            odd6 = sixthInput;
        }


        int even = even1 + even2 + even3 + even4 + even5 + even6;
        int odd = odd1 + odd2 + odd3 + odd5 + odd6;

        System.out.println("The sum of the even numbers is: "+ even);
        System.out.println("The sum of the odd numbers is: "+ odd);

    }

}

