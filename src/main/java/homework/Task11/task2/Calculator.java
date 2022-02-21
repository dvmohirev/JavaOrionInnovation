package homework.Task11.task2;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private static final String OPERATION = "\" operation.";
    private static final String CALCULATOR_DOES_NOT_HAVE = "The calculator does not have \"";

    private Map<String, Operation> operations = new HashMap<>();

    public Double calculate(String operationName, Double firstNumber, Double secondNumber) throws  IllegalOperationException{
        Double result;

        if(operations.containsKey(operationName)) {
            result = operations.get(operationName).doOperation(firstNumber, secondNumber);
        }
        else {
            throw new IllegalOperationException(CALCULATOR_DOES_NOT_HAVE + operationName + OPERATION);
        }

        return result;
    }

    public void addOperation(String operationName, Operation implementation) {
        operations.put(operationName, implementation);
    }
}
