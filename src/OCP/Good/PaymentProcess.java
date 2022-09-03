package OCP.Good;

public class PaymentProcess{
	public void process(IPay pay){
		pay.makePayment();
	}
}
