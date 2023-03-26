package OODesign.Behavioral.ChainOfResponsibility;

public class UPIPayment extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if (amount <= 1000) {
            System.out.println("Payment done using UPI : $" + amount);
        }else {
            next.handlePayment(amount);
        }
    }
}
