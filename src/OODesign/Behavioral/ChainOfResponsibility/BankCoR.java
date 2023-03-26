package OODesign.Behavioral.ChainOfResponsibility;

public class BankCoR {
    public static void main(String[] args) {
        PaymentHandler bank = new BankPayment();
        PaymentHandler upi = new UPIPayment();
        PaymentHandler card = new CardPayment();

        card.setNext(upi);
        upi.setNext(bank);

        card.handlePayment(1000);
        card.handlePayment(499);
        card.handlePayment(1001);
        card.handlePayment(10);

    }
}
