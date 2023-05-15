package LordGboli;

public class AirAc {
    private boolean isOn;
    private int temperateture;

    public void toggleOn() {
        //if (isOn == false) isOn =true;
        //else if (isOn == true) isOn = false;
        isOn = !isOn;
        }

    public boolean isOn() {
        return isOn;
    }

    public int getTemperature() {
        return temperateture;
    }

    public void increaseTemperature() {
        if (temperateture < 30) temperateture++;
    }
}
