import org.junit.jupiter.api.Test;
import tdd.AirCondition;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionTest {

    @Test
    public void iHaveAnAcTest() {
        AirCondition airCondition = new AirCondition();
    }

    @Test
    public void turnOnAcTest() {
        AirCondition airCondition = new AirCondition();
        airCondition.isOn();
        assertTrue(airCondition.isOn());
    }

    @Test
    public void turnOff() {
        AirCondition airCondition = new AirCondition();
        airCondition.isOff();
        assertTrue(airCondition.isOff());
    }
    @Test
    public void IncreaseTemperatureTest() {
        AirCondition airCondition = new AirCondition();
        airCondition.isOn();
        airCondition.increaseTemperature();
        assertEquals(17, airCondition.getTemperature());

    }


    @Test
    public void decreaseTemperature(){
        AirCondition airCondition = new AirCondition();
        airCondition.isOn();
        airCondition.increaseTemperature();
        airCondition.decreaseTemperature();
        assertEquals(16, airCondition.getTemperature());
    }
    @Test
        public void increaseTemperatureBeyond30Test(){
        AirCondition airCondition = new AirCondition();
        airCondition.isOn();
        airCondition.increaseTemperature();
        airCondition.increaseTemperature();
        airCondition.increaseTemperature();
        airCondition.increaseTemperature();
        airCondition.increaseTemperature();
        airCondition.increaseTemperature();
        airCondition.increaseTemperature();
        airCondition.increaseTemperature();
        airCondition.increaseTemperature();
        airCondition.increaseTemperature();
        airCondition.increaseTemperature();
        airCondition.increaseTemperature();
        airCondition.increaseTemperature();
        airCondition.increaseTemperature();
        airCondition.increaseTemperature();
        assertEquals(30,airCondition.getTemperature());

    }
    @Test
    public void decreaseTemperatureBelow16Test(){
    AirCondition airCondition = new AirCondition();
    airCondition.isOn();
    airCondition.decreaseTemperatureBelow();
    assertEquals(16, airCondition.getTemperature());

    }
}