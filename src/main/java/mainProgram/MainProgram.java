package mainProgram;

import Lesson1.Lamp;
import Lesson1.LampController;

public class MainProgram {
    public static void main(String[] args) throws InterruptedException {
        boolean isDay = true;
        LampController lampController = new LampController();
        while(true){
            if (isDay){
                lampController.switchToNormal();
            } else {
                lampController.switchToYellowBlinking();
            }
            lampController.operateWithColors();
        }

    }

}
