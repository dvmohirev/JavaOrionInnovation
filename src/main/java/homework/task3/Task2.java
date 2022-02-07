package homework.task3;

import java.util.Random;

public class Task2 {
    //Случайности - не случайны

    static class SequentialRandom {
        private static int example = 0;
        private static int tempExp = 0;

        public int getExample() {
            if (example == 0){
                example = new Random().nextInt();
                tempExp = example;
            } else {
                example = tempExp + 1;
            }
            return example;
        }


        public static int resetRandom(){
            example = 0;
            return example;
        }
    }
}
