package SOLID_Principles.DIP.Good;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int res = calculator.calculate(10, 20, new SubOperation());
        System.out.println(res);
    }
}

interface CalInterface {
    int calculate(int a, int b);
}
class Calculator {
    public int calculate(int a , int b, CalInterface calInterface){
        return calInterface.calculate(a, b);
    }
}

class AddOperation implements CalInterface{
    public int calculate(int a, int b){
        return a + b;
    }
}
class SubOperation implements CalInterface{
    public int calculate(int a, int b){
        return a - b;
    }
}
