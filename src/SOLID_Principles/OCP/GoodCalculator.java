package SOLID_Principles.OCP;

public class GoodCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int res = calculator.calculate(10, 20, new Subtraction());
        System.out.println(res);
    }
}

class Calculator {
    public int calculate(int num1, int num2, Operations operations) {
        return operations.operation(num1, num2);
    }
}

interface Operations {
    int operation(int num1, int num2);
}

class Addition implements Operations {
    @Override
    public int operation(int num1, int num2) {
        return num1 + num2;
    }
}

class Subtraction implements Operations {
    @Override
    public int operation(int num1, int num2) {
        return num1 - num2;
    }
}
