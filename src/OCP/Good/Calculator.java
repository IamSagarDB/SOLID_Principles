package OCP.Good;

public class Calculator {
    public int calculate(int num1, int num2, Operations operations){
        return operations.operation(num1, num2);
    }
}
