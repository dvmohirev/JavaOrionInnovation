package homework.Task2;

import java.util.Random;

public class Task1 {
    public void doItWithMassive (){
        int[] massive = new int[10];
        Random random = new Random();
        long sum = 0;
        //Заполняем массив и выводим на экран строкой
        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt();
            if (i == massive.length - 1){
                System.out.print(massive[i]);
            } else {
                System.out.print(massive[i] + " ");
            }
        }
        //считаем сумму всех элементов и выводим на экран
        for (int i = 0; i < massive.length; i++) {
            sum = sum + massive[i];
        }
        System.out.println();
        System.out.println(sum);

        //Находим мин. элемент и вывести на экран его индекс и значение
        int minElemFromMass = massive[0];
        int index = 0;
        for (int i = 1; i < massive.length; i++) {
            if (minElemFromMass > massive[i]){
                minElemFromMass = massive[i];
                index = i;
            }
        }
        System.out.printf("Минимальный элемент: индекс элемента в массиве = %s ; значение элемента = %s", index, minElemFromMass);
    }
}
