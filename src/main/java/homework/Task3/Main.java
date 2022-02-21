package homework.Task3;

public class Main {
    public static void main(String[] args) {

        // решаем задачу 1
        /*String[] names = {"Андрей", "Антон", "Вова", "Влад", "Дима"};
        String[] lastNames = {"Иванов", "Петров", "Сидоров", "Мохирев", "Баранов", "Комаров"};
        Task1.Person[] persons = new Task1.Person[50];
        for (int j = 0; j < persons.length; j++) {
            int n = (int)Math.floor(Math.random() * names.length);
            int m = (int)Math.floor(Math.random() * lastNames.length);
            persons[j] = new Task1.Person(names[n], lastNames[m]);
        }

        for (int j = 0; j < persons.length; j++) {
            System.out.println("Человек №" + j +  " - " + persons[j].getLastName() + ", " + persons[j].getFirstName());
        }*/
        /*Task1 task1 = new Task1();
        task1.digitalForPerson();*/

        // решаем задачу 2
        new Task2.SequentialRandom();
        new Task2.SequentialRandom();
        new Task2.SequentialRandom();
        Task2.SequentialRandom.resetRandom();
        new Task2.SequentialRandom();
        new Task2.SequentialRandom();
    }
}
