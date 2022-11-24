package LSP.Good;

import LSP.Good.LoanPayment;

public interface SecurePayment extends LoanPayment {
    void foreCloseLoan();
}
