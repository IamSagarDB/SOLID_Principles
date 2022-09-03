package OCP.Good;

class Main {
	public static void main(String[] args){
		PaymentProcess process = new PaymentProcess();
		process.process(new UPIPayment());
	}
}
