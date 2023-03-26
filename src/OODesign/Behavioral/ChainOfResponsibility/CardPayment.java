package OODesign.Behavioral.ChainOfResponsibility;

public class CardPayment extends PaymentHandler {
    @Override
    public void handlePayment(double amount) {
        if (amount < 500) {
            System.out.println("Payment done using Card: $" + amount);
        } else {
            next.handlePayment(amount);
        }
    }
}
