public class ArrayFunction {
    public static int[] doubleArray(int[] arr) {
        int[] doubledArr = new int[arr.length];
        for (int index = 0; index < arr.length; index++) {
            doubledArr[index] = arr[index] * 2;
        }
        return doubledArr;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int[] result = doubleArray(myArray);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}