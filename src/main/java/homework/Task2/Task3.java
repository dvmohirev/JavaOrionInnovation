package homework.Task2;

import java.util.Random;

public class Task3 {
    public void magnitDiffThings (){
        int[] firstMass = new int[7];
        int[] secondMass = new int[7];
        Random random = new Random();
        int k = 0, m = 0;

        while(k + m != 14){
            int num = random.nextInt();
            if (num > 0) {
                if (k == 7){
                    continue;
                } else {
                    firstMass[k] = num;
                    k++;
                }

            } else {
                if (m == 7){
                    continue;
                } else {
                    secondMass[m] = num;
                    m++;
                }
            }
        }

        // Выводим массив с положительными числами
        System.out.println("Выводим массив с положительными числами: ");
        for (int i = 0; i < firstMass.length; i++) {
            if (i == firstMass.length - 1){
                System.out.print(firstMass[i]);
            } else {
                System.out.print(firstMass[i] + " ");
            }
        }
        System.out.println();
        // Выводим массив с отрицательными числами
        System.out.println("Выводим массив с отрицательными числами: ");
        for (int i = 0; i < secondMass.length; i++) {
            if (i == secondMass.length - 1){
                System.out.print(secondMass[i]);
            } else {
                System.out.print(secondMass[i] + " ");
            }
        }
        System.out.println();

        //создаем новый массив на 7 элементов
        int[] sumMass = new int[7];
        //складываем в этом массиве значение элементов по i
        System.out.println("Выводим суммирующий массив: ");
        for (int i = 0; i < sumMass.length; i++) {
            sumMass[i] = firstMass[i] + secondMass[i];
            if (i == sumMass.length - 1){
                System.out.print(sumMass[i]);
            } else {
                System.out.print(sumMass[i] + " ");
            }
        }

    }
}
