package OCP.Good;

public class CardPayment implements IPay {
	
	@Override
	public void makePayment(){
		System.out.println("Card Payments is Successfully!!");
	}
}
