package Snack;

public class SumNaturalNums {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 20; i++){
            if (i > 0 && i < 11) sum = sum + i;
        }
        System.out.println(sum);
    }
}