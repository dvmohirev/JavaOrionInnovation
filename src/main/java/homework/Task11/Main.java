package homework.Task11;

import homework.Task11.task1.Names;
import homework.Task11.task1.Person;
import homework.Task11.task2.Calculator;
import homework.Task11.task2.IllegalOperationException;
import homework.Task11.task3.Lection;
import homework.Task11.task3.Student;

import java.time.LocalDate;
import java.util.*;

public class Main {
    //task1
    private static final int MIN_AGE = 15;
    private static final int MAX_INT = 45;
    private static final List<Person> personList = new ArrayList<>();

    //task2
    private static final String SUM_VALUE = "sum";
    private static final String MULTIPLICATION_VALUE = "multiplication";
    private static final String DIVISION_VALUE = "division";
    private static final String SUBTRACTION_VALUE = "subtraction";
    private static final String EXPONENTATION_VALUE = "exponentation";
    private static final String ROOT_VALUE = "root";
    private static final String SOME_OPERATION_VALUE = "some operation";
    private static final String SUM_STRING = "Sum = ";
    private static final String MULTIPLICATION_STRING = "Multiplication = ";
    private static final String QOTIENT_STRING = "Qotient = ";
    private static final String DIFFERENCE_STRING = "Difference = ";
    private static final String EXPONENTATION_STRING = "Exponentation = ";
    private static final String ROOT_STRING= "Root = ";
    private static final String SOME_OPERATION_STRING = "Some operation = ";
    private static final String ENTER_FIRST_NUMBER = "Enter the first number: ";
    private static final String ENTER_SECOND_NUMBER = "Enter the second number: ";
    private static final String NOT_DIGIT_ARGUMENGTS = "Provided arguments are not digits.";

    public static void main(String[] args) {
        /*//task1
        addElementsToCollection();
        personList.forEach((person) -> System.out.println(person));

        Collections.sort(personList, (Person firstPerson, Person secondPerson) -> firstPerson.getName().compareTo(secondPerson.getName()));
        personList.forEach((person) -> System.out.println(person));
        System.out.println();

        Collections.sort(personList, (Person firstPerson, Person secondName) -> firstPerson.getAge().compareTo(secondName.getAge()));
        personList.forEach((person) -> System.out.println(person));

        //task2
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(ENTER_FIRST_NUMBER);
            Double firstNum = scanner.nextDouble();
            System.out.println(ENTER_SECOND_NUMBER);
            Double secondNum = scanner.nextDouble();

            calculator.addOperation(SUM_VALUE, (firstNumber, secondNumber) -> firstNumber + secondNumber);
            System.out.println(SUM_STRING + calculator.calculate(SUM_VALUE, firstNum, secondNum));

            calculator.addOperation(MULTIPLICATION_VALUE, (firstNumber, secondNumber) -> firstNumber * secondNumber);
            System.out.println(MULTIPLICATION_STRING + calculator.calculate(MULTIPLICATION_VALUE, firstNum, secondNum));

            calculator.addOperation(DIVISION_VALUE, (firstNumber, secondNumber) -> firstNumber / secondNumber);
            System.out.println(QOTIENT_STRING + calculator.calculate(DIVISION_VALUE, firstNum, secondNum));

            calculator.addOperation(SUBTRACTION_VALUE, (firstNumber, secondNumber) -> firstNumber - secondNumber);
            System.out.println(DIFFERENCE_STRING + calculator.calculate(SUBTRACTION_VALUE, firstNum, secondNum));

            calculator.addOperation(EXPONENTATION_VALUE, (firstNumber, secondNumber) -> Math.pow(firstNumber, secondNumber));
            System.out.println(EXPONENTATION_STRING + calculator.calculate(EXPONENTATION_VALUE, firstNum, secondNum));

            calculator.addOperation(ROOT_VALUE, (firstNumber, secondNumber) -> Math.exp(Math.log(firstNumber) / secondNumber));
            System.out.println(ROOT_STRING + calculator.calculate(ROOT_VALUE, firstNum, secondNum));

            System.out.println(SOME_OPERATION_STRING + calculator.calculate(SOME_OPERATION_VALUE, firstNum, secondNum));
        }
        catch(IllegalOperationException | InputMismatchException ex) {
            if(ex instanceof IllegalOperationException) {
                System.out.println(ex.getMessage());
            }
            else {
                System.out.println(NOT_DIGIT_ARGUMENGTS);
            }
        }*/

        //task3
        //для примера разместили одного студента, который посетил все 5 курсов
        List<Student> students = new ArrayList<>();
        Set<Lection> lec = new HashSet<>();
        lec.add(new Lection("матанализ", LocalDate.of(2022, 6, 5)));
        lec.add(new Lection("философия", LocalDate.of(2022, 6, 10)));
        lec.add(new Lection("английский язык", LocalDate.of(2022, 6, 15)));
        lec.add(new Lection("история", LocalDate.of(2022, 6, 20)));
        lec.add(new Lection("физкультура", LocalDate.of(2022, 6, 25)));

        Student st = new Student("Дима", lec);
        students.add(st);
        //Выведите список студентов, которые хоть раз посещали матанализ.
        //Нужно сначала получить одного студента -> получить список его лекций->
        //проверить каждую лекцию на соответствие названия искомой лекции->
        //если true - выводим имя студента, если false - берем следующего
        //решение задачи без использования Stream
        for (Student man : students) {
            for (Lection lc: man.lectionSet) {
                if (lc.getTitleOfLection().equals("матанализ")){
                    System.out.println(man.getName());
                }
            }
        }
        //делаем с помощью stream - не придумал пока

    }
    //task1
    private static void addElementsToCollection() {
        Random random = new Random();
        personList.add(new Person(Names.VLAD.geValue(), random.nextInt(MAX_INT - MIN_AGE + 1) + MIN_AGE));
        personList.add(new Person(Names.KARL.geValue(), random.nextInt(MAX_INT - MIN_AGE + 1) + MIN_AGE));
        personList.add(new Person(Names.ANNA.geValue(), random.nextInt(MAX_INT - MIN_AGE + 1) + MIN_AGE));
        personList.add(new Person(Names.SOFIA.geValue(), random.nextInt(MAX_INT - MIN_AGE + 1) + MIN_AGE));
        personList.add(new Person(Names.MIKE.geValue(), random.nextInt(MAX_INT - MIN_AGE + 1) + MIN_AGE));
    }
}
