package LSP.Bad;

/**
 * In this situation . once foreCloseLoan is called CreditCardLoan will throw exception.
 * This will violate LSP
 */
public class LoanClosureService {
    LoanPayment loanPayment;

    public LoanClosureService(LoanPayment loanPayment){
        this.loanPayment = loanPayment;
    }

    public void foreCLoseLoan(){
        loanPayment.foreCloseLoan();
    }
}
