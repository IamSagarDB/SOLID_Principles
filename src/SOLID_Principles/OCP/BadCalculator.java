package SOLID_Principles.OCP;

/**
 * Right now we have "add" and "sub" operation , If we want to add more operation than we need to modify the existing class.
 * So this will violet Open Close Principle
 */

public class BadCalculator {
    public int calculate(int num1, int num2, String type) {
        int result = 0;

        switch (type) {
            case "sum":
                result = num1 + num2;
                break;
            case "sub":
                result = num1 - num2;
                break;
        }
        return result;
    }
}
