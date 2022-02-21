package homework.Task3;

import java.util.Random;

public class Task2 {
    //Случайности - не случайны
    static class SequentialRandom {
        private static int value;
        private static boolean isValueReset = false;

        public SequentialRandom() {
            if (!isValueReset) {
                resetRandom();
                isValueReset = true;
            } else {
                value++;
            }
        }

        public int getValue() {
            return value;
        }

        public static void resetRandom() {
            value = new Random().nextInt(20);
        }
    }
}
