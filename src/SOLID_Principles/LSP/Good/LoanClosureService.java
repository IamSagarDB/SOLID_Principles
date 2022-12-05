package SOLID_Principles.LSP.Good;

public class LoanClosureService {
    SecurePayment securePayment;

    public LoanClosureService(SecurePayment securePayment){
        this.securePayment = securePayment;
    }

    public void foreCLoseLoan(){
        securePayment.foreCloseLoan();
    }
}
