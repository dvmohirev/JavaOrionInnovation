package Lesson1;

public class Lamp {
        boolean isOn = false;

    public Lamp(int pin) {

    }

    public void turnOn(){
            isOn = true;
        }
        public void turnOff(){
            isOn = false;
            //raspberryPi.gpio(pinNumber, 0);
        }
}
