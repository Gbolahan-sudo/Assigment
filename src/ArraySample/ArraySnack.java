package ArraySample;

import java.util.Arrays;

public class ArraySnack {
int[] array ;

    //    public static void main(String[] args) {
//        int[] array = new int[10];
//        System.out.println(array);
//        for (int index = args.length; index < array.length; index++){
//            array[index] += index + 1;
//        }
//        System.out.println(Arrays.toString(array));
//    }

    public void setArray(int[]array){

        for (int index = 0; index < array.length; index++){
            array[index] += index + 1;
        }

        this.array=array;


    }

    public int[] getArray() {
        return array;
    }
}


