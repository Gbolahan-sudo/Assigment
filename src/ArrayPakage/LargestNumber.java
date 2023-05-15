package ArrayPakage;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int [] sortArray ={12,30,110,45,80};
        System.out.println(largeElement(sortArray));


    }

    public static int largeElement(int [] array){
        int maximum = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] > maximum) maximum = array[index];


        }
        return maximum;
    }




























}