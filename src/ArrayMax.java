public class ArrayMax {
    public static void main(String[] args) {
        int[] array = {1, 4, 9, 2, 3};
        System.out.println(arrayMax(array));

        System.out.println(arrayMin(array));
    }
    public static int arrayMin ( int[] arrayNumbers){
        int minNumber = arrayNumbers[0];
        for (int i = 0; i < arrayNumbers .length; i++){
            if (arrayNumbers[i] < minNumber) minNumber = arrayNumbers[i];
        }
        return minNumber;
    }
    public static int arrayMax ( int[] arrayNumbers){
        int maaxNumber = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] > maaxNumber) maaxNumber = arrayNumbers[i];
        }
        return maaxNumber;
    }
}

