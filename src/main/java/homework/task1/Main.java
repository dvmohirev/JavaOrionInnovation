package homework.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        Integer firstNum = sc.nextInt();
        Integer secondNum = sc.nextInt();*/

        /*Integer firstNum = Integer.parseInt(args[0]);
        Integer secondNum = Integer.parseInt(args[1]);*/

        Integer firstNum = 10;
        Integer secondNum = 2;

        if (firstNum > secondNum) {
            System.out.printf("Число %s больше %s", firstNum, secondNum);
        } else if (firstNum < secondNum){
            System.out.printf("Число %s меньше %s", firstNum, secondNum);
        } else {
            System.out.printf("Число %s равно %s", firstNum, secondNum);
        }
        System.out.println();
        System.out.printf("%s + %s = %s", firstNum, secondNum, (firstNum+secondNum));
    }
}
