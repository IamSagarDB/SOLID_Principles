package SOLID_Principles.LSP.Bad;

public class Main {
    public static void main(String[] args) {
        LoanClosureService service = new LoanClosureService(new HomeLoan());
        service.foreCLoseLoan();
    }
}
