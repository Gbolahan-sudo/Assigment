package LordGboli;

import java.util.Scanner;

public class AddNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your num");
        int yourNum = input.nextInt();
        int sum = yourNum + yourNum;
        System.out.println(sum);


    }
}
