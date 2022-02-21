package homework.Task4;

import homework.Task4.task1.Fruit;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Задача 1
        //Примечание - Сделать заполнение массива случайными фруктами
        Fruit fruit = new Fruit();
        Fruit[] fruits = new Fruit[4];
        ArrayList<Integer> listForCheck = new ArrayList<Integer>(4);
        while (listForCheck.size() < 4){
            int x = 1 + (int)(Math.random()*4);
            boolean ans = listForCheck.contains(x);
            if (ans){
                continue;
            } else {
                listForCheck.add(x);
            }
        }
        for (int i = 0; i < fruits.length; i++) {

            switch (listForCheck.get(i)){
                case 1:
                    fruits[i] = fruit.getRandomFruit(Fruit.FruitType.APPLE);
                    break;
                case 2:
                    fruits[i] = fruit.getRandomFruit(Fruit.FruitType.ORANGE);
                    break;
                case 3:
                    fruits[i] = fruit.getRandomFruit(Fruit.FruitType.PINEAPPLE);
                    break;
                case 4:
                    fruits[i] = fruit.getRandomFruit(Fruit.FruitType.FRUIT);
                    break;
            }
        }
        for (int k = 0; k < fruits.length; k++) {
            System.out.println(fruits[k]);
        }

        //Задача 2
        /*Создайте массив на 10 элементов и поместите туда
        10 случайных фабрик одного из 4 описанных выше типов.*/
        /*AbstractFabric[] abstractFabrics = new AbstractFabric[10];
        for (int i = 0; i < abstractFabrics.length; i++) {
            int x = 1 + (int)(Math.random()*((4 - 1) + 1));
            switch (x){
                case 1:
                    ThinOrangeFactory thinOrangeFactory = new ThinOrangeFactory();
                    abstractFabrics[i] = thinOrangeFactory;
                    break;
                case 2:
                    RedApplesFactory redApplesFactory = new RedApplesFactory();
                    abstractFabrics[i] = redApplesFactory;
                    break;
                case 3:
                    GreenApplesFactory greenApplesFactory = new GreenApplesFactory();
                    abstractFabrics[i] = greenApplesFactory;
                    break;
                case 4:
                    LongPinepplesFactory longPinepplesFactory = new LongPinepplesFactory();
                    abstractFabrics[i] = longPinepplesFactory;
                    break;
            }
        }
        *//*for (int i = 0; i < abstractFabrics.length; i++) {
            System.out.println(abstractFabrics[i]);
        }*//*
        *//*Создайте массив типа Fruit на 20 элементов
        и заполните его фруктами из всех фабрик -
        по 2 фрукта от одной фабрики.*//*
        Fruit[] fruits = new Fruit[20];
        // Не получается с наскока, надо поискать алгоритм или подумать
        int m = 0;
        for (int i = 0; i < fruits.length; i = i+2) {
            if (m < 10){
                fruits[i] = abstractFabrics[m].makeFruit();
                fruits[i+1] = abstractFabrics[m].makeFruit();
                m++;
            }
        }
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Номер фрукта: " + i);
            System.out.println(fruits[i]);
        }*/

        }


    }
