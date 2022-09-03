package OCP.Bad;

public class PaymentProcessor {
		public void process(PaymentMode mode){
			if(mode == PaymentMode.CARD){
				CardPayment card = new CardPayment();
				card.makePayment();
			}else if(mode == PaymentMode.UPI){
				UPIPayment upi = new UPIPayment();
				upi.makePayment();
			}

		}
}