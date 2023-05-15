package ArrayPakage;

import java.util.Arrays;

public class Reverse{
    public static void main(String[] args) {
        int[]  newArray = {23,14,65,1,2};
        System.out.println(Arrays.toString(array(newArray)));
    }

    public static int []array(int [] sortArray){
        for (int index = 0; index < sortArray.length-1; index++) {
            if (sortArray[index] > sortArray[index +1]){
              int  container = sortArray[index];
                sortArray[index] = sortArray[index+1];
                sortArray[index+1] = container;
                index= -1;


            }

        }
        return sortArray;
    }

}
