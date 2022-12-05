package SOLID_Principles.OCP.Good;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int res = calculator.calculate(10,20, new Subtraction());
        System.out.println(res);
    }
}
