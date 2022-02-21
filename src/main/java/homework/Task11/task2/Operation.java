package homework.Task11.task2;

@FunctionalInterface
public interface Operation {
    Double doOperation(Double number1, Double number2) throws ArithmeticException;
}
