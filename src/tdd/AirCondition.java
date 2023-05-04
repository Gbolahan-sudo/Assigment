package tdd;
public class AirCondition {
    private int temperature = 16;
    public boolean isOn() {
        return true;
    }

    public boolean isOff() {
        return true;
    }

    public void increaseTemperature() {
        if (temperature < 30) {
            temperature++;
        }
    }

    public void decreaseTemperature() {
        temperature--;
    }

    public int getTemperature() {
        return temperature;
    }

    public int increaseTemperatureBeyond() {
        return temperature++;
    }


    public void decreaseTemperatureBelow() {
        if (temperature > 16) {
            temperature--;
        }
    }
}
