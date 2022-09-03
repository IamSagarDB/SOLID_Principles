package OCP.Bad;

class Main {
	public static void main(String[] args){
		PaymentProcessor process = new PaymentProcessor();
		process.process(PaymentMode.UPI);
	}
}
