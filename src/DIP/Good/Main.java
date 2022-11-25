package DIP.Good;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int res = calculator.calculate(10, 20, new SubOperation());
        System.out.println(res);
    }

}
