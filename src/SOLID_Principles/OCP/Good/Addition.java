package SOLID_Principles.OCP.Good;

public class Addition implements Operations{
    @Override
    public int operation(int num1, int num2) {
        return num1 + num2;
    }
}
