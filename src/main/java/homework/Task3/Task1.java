package homework.Task3;

public class Task1 {
    // Цифровая персонализация
    /*public void digitalForPerson(){
        String[] names = {"Андрей", "Антон", "Вова", "Влад", "Дима"};
        String[] lastNames = {"Иванов", "Петров", "Сидоров", "Мохирев", "Баранов", "Комаров"};
        Person[] persons = new Person[50];
        for (int j = 0; j < persons.length; j++) {
            int n = (int)Math.floor(Math.random() * names.length);
            int m = (int)Math.floor(Math.random() * lastNames.length);
            persons[j] = new Person(names[n], lastNames[m]);
        }

        for (int j = 0; j < persons.length; j++) {
            System.out.println("Человек №" + (j+1) +  " - " + persons[j].getLastName() + ", " + persons[j].getFirstName());
        }
    }*/

    public static class Person{
        private String firstName;
        private String lastName;

        public Person(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public String toString() {
            return "Фамилия" + lastName + ", Имя" + firstName + '\'';
        }
    }
}
