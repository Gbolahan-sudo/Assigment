import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        System.out.println("Enter number or press -1 to stop");
       int userInput = input.nextInt();
       int smallestNumber = 0;
       int largestNumber = 0;
       boolean terminateOption = false;
       while (terminateOption == true) {
           System.out.println("Enter number or press -1 to stop");
           userInput = input.nextInt();
           if (userInput < smallestNumber) {
               smallestNumber = userInput;
           }
           if (userInput > largestNumber) {
               largestNumber = userInput;
           }

       }
        System.out.println("The smallest number is"+ smallestNumber);
        System.out.println("The largest number is " + largestNumber);
    }

}
