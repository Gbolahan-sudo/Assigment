package LordGboli;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AcTest {
    AirAc myAc = new AirAc();
    @Test
    public void isOnAcTest(){
        myAc.toggleOn();
        assertTrue(myAc.isOn());
    }
    @Test public void increaseTemperatureTest(){
        //Give
        myAc.toggleOn();
        assertTrue(myAc.isOn());
        assertEquals(0, myAc.getTemperature());
        //when
        myAc.increaseTemperature();
        //Assert
        assertEquals(1, myAc.getTemperature());
    }
    @Test public void maximumTemperatureTest(){
        myAc.toggleOn();
        for (int i = 0; i <= 30; i++) myAc.increaseTemperature();
        myAc.increaseTemperature();
        assertEquals(30, myAc.getTemperature());
    }
}
