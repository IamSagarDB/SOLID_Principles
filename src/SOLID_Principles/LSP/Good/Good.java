package SOLID_Principles.LSP.Good;

public class Good {
    public static void main(String[] args) {
        LoanClosureService service = new LoanClosureService(new HomeLoan());
        service.foreCLoseLoan();
    }
}

class LoanClosureService {
    SecurePayment securePayment;

    public LoanClosureService(SecurePayment securePayment) {
        this.securePayment = securePayment;
    }

    public void foreCLoseLoan() {
        securePayment.foreCloseLoan();
    }
}

interface SecurePayment extends LoanPayment {
    void foreCloseLoan();
}

interface LoanPayment {
    void doPayment();
}

class HomeLoan implements SecurePayment {
    @Override
    public void doPayment() {

    }

    @Override
    public void foreCloseLoan() {

    }
}

class CreditCardLoan implements LoanPayment {
    @Override
    public void doPayment() {

    }
}
