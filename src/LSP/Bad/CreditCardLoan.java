package LSP.Bad;

public class CreditCardLoan implements LoanPayment{
    @Override
    public void doPayment(int amount) {

    }

    @Override
    public void foreCloseLoan() {
        throw new UnsupportedOperationException("Credit card loan is not allowed to make foreCloseLoan");
    }
}
