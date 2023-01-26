package SOLID_Principles.LSP.Bad;

public class Bad {
    public static void main(String[] args) {
        LoanClosureService service = new LoanClosureService(new HomeLoan());
        service.foreCloseLoan();
    }
}

/**
 * In this situation . once foreCloseLoan is called CreditCardLoan will throw exception.
 * CreditCardLoan is not allowed to do foreCloseLoan
 * This will violate SOLID_Principles.LSP
 */
class LoanClosureService {
    LoanPayment loanPayment;
    public LoanClosureService(LoanPayment loanPayment) {
        this.loanPayment = loanPayment;
    }
    public void foreCloseLoan() {
        loanPayment.foreCloseLoan();
    }
}

/**
 * doPayment - Make payment for load
 * foreCloseLoad - close load by paying remaining amount
 */
interface LoanPayment {
    void doPayment(int amount);
    void foreCloseLoan();
}


class HomeLoan implements LoanPayment {
    @Override
    public void doPayment(int amount) {

    }
    @Override
    public void foreCloseLoan() {

    }
}

class CreditCardLoan implements LoanPayment {
    @Override
    public void doPayment(int amount) {

    }
    @Override
    public void foreCloseLoan() {
        throw new UnsupportedOperationException("Credit card loan is not allowed to make foreCloseLoan");
    }
}

