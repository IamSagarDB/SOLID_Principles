package SOLID_Principles.LSP.Good;

public interface SecurePayment extends LoanPayment {
    void foreCloseLoan();
}
