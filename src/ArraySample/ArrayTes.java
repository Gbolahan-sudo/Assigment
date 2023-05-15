package ArraySample;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ArrayTes {
    ArraySnack object = new ArraySnack();
    @Test
    public void arraySnackTest(){
    int [] array = new int[5];
        object.setArray(array);
        int [] gottenArray = object.getArray();

        assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(gottenArray));
    }

}
