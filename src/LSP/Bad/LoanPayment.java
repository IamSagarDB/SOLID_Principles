package LSP.Bad;

/**
 * doPayment - Make payment for load
 * foreCloseLoad - close load by paying remaining amount
 */
public interface LoanPayment {
    void doPayment(int amount);
    void foreCloseLoan();
}
