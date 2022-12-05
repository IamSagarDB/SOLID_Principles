
package SOLID_Principles.DIP.Good;

public class SubOperation implements CalInterface{
    public int calculate(int a, int b){
        return a - b;
    }
}
