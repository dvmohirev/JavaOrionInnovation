package Lesson1;

public class LampController {
    //убрать параметры, чтобы работала программа
    Lamp red = new Lamp(1);
    Lamp yel = new Lamp(2);
    Lamp grn = new Lamp(3);
    State mode = State.NORMAL;
    enum State{
        NORMAL,
        YELLOW_BLINKING
    }

    public void operateWithColors() throws InterruptedException {
        if (mode == State.NORMAL){
            while (mode.equals("normal")){
                red.turnOn();
                Thread.currentThread().sleep(5000);
                red.turnOff();
                yel.turnOn();
                Thread.currentThread().sleep(2000);
                yel.turnOff();
                grn.turnOn();
                Thread.currentThread().sleep(10000);
                grn.turnOff();
            }
        } else if (mode == State.YELLOW_BLINKING){
            red.turnOff();
            grn.turnOff();
            yel.turnOn();
            Thread.currentThread().sleep(10000);
            yel.turnOff();
            Thread.currentThread().sleep(10000);
        }
    }

    public void switchToNormal() throws InterruptedException {
        mode = State.NORMAL;
    }

    public void switchToYellowBlinking() throws InterruptedException{
        mode = State.YELLOW_BLINKING;
    }

}
