package OODesign.Behavioral.ChainOfResponsibility;

public class BankPayment extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if (amount > 1000) {
            System.out.println("Payment done using Bank: $" + amount);
        }else {
            next.handlePayment(amount);
        }
    }
}
