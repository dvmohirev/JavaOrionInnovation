package homework.Task2;

import java.util.Random;

public class Task2 {
    public void randomGoAway (){
        Random random = new Random();
        int[] massive = new int[5];
        //Заполняем массив и выводим на экран строкой
        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt();
            if (i == massive.length - 1){
                System.out.print(massive[i]);
            } else {
                System.out.print(massive[i] + " ");
            }
        }
        System.out.println();
        //Создаем два массива для четных и нечетных чисел
        int[] massEvenNumbers = new int[massive.length];
        int[] massUnevenNumbers = new int[massive.length];
        byte k = 0, m = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0){
                massEvenNumbers[k] = massive[i];
                k++;
            } else {
                massUnevenNumbers[m] = massive[i];
                m++;
            }
        }
        //выводим массив с четными числами
        System.out.print("Выводим массив с четными числами: ");
        for (int i = 0; i < massEvenNumbers.length; i++) {
            if (massEvenNumbers[i] != 0){
                if (i == massEvenNumbers.length - 1){
                    System.out.print(massEvenNumbers[i]);
                } else {
                    System.out.print(massEvenNumbers[i] + " ");
                }
            }
        }
        System.out.println();
        //выводим массив с нечетными числами
        System.out.print("Выводим массив с нечетными числами: ");
        for (int i = 0; i < massUnevenNumbers.length; i++) {
            if (massUnevenNumbers[i] != 0) {
                if (i == massUnevenNumbers.length - 1) {
                    System.out.print(massUnevenNumbers[i]);
                } else {
                    System.out.print(massUnevenNumbers[i] + " ");
                }
            }
        }
        System.out.println();
        //находим среднее значение в каждом массиве и выводим на экран
        int sumEven = 0;
        int sumUneven = 0;
        for (int i = 0; i < massEvenNumbers.length; i++) {
            sumEven = sumEven + massEvenNumbers[i];
        }
        for (int i = 0; i < massUnevenNumbers.length; i++) {
            sumUneven = sumUneven + massUnevenNumbers[i];
        }
        System.out.printf("Среднее значение Четного массива = %d %n", sumEven/k);
        System.out.printf("Среднее значение Нечетного массива = %d %n", sumUneven/m);
    }
}
