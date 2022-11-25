package DIP.Good;

public class Calculator {
    public int calculate(int a , int b, CalInterface calInterface){
        return calInterface.calculate(a, b);
    }
}
