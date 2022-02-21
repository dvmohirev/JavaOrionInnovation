package homework.Task6;

public class Main {
    public static void main(String[] args) {
        //Добавляем 11 великов и возможно, какой-то не добавится.
        //Если не добавиться, вывести в лог велик, который не добавился
        MyArrayList<Bicycle> listOfBicycle = new MyArrayList<>();
        for (int i = 0; i < 15; i++) {
        try {
            listOfBicycle.add(new Bicycle());
            System.out.println("Велосипед №" + i + " М: " + listOfBicycle.get(i).getModelName() + " С: " + listOfBicycle.get(i).getMaxSpeed());
        } catch (MyArrayStoreException e) {
            System.err.println(e.getMessage() + " Велосипед №" + i + " не был добавлен");

        }
    }

        System.out.println();
        //Проверяем, что все методы работают правильно
        int check = (int) (Math.random()*50);
        System.out.println("Удаляем велосипеды у которых скорость меньше " + check + ":");
        for (int i = 0; i < listOfBicycle.size(); i++) {
            if(listOfBicycle.get(i).getMaxSpeed() < check){
                System.out.println("Велосипед " + " М: " + listOfBicycle.get(i).getModelName() + " удалили");
                listOfBicycle.remove(listOfBicycle.get(i));
                i--;
            }
        }
        System.out.println();
        for (int i = 0; i < listOfBicycle.size(); i++) {
            System.out.println("Велосипед №" + i + " М: " + listOfBicycle.get(i).getModelName() + " С: " + listOfBicycle.get(i).getMaxSpeed());
        }
        //Итог - Проверили, выдает ошибку при добавлении 11 элемента


        //Теперь заполняем числами Список
        /*MyArrayList<Integer> listOfNums = new MyArrayList<>();
        for (int i = 0; i < 10; i++) {
            listOfNums.add((int) (1 + Math.random()*10));
            System.out.print(listOfNums.get(i) + " ");
        }
        System.out.println();
        //Удаляем четные числа
        for (int i = 0; i < listOfNums.size(); i++) {
            if (listOfNums.get(i) % 2 == 0){
                listOfNums.remove(listOfNums.get(i));
                i--;
            } else {
                System.out.print(listOfNums.get(i) + " ");;
            }
        }*/
    }
}
