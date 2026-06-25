package prep.karat.payment;

import prep.karat.exception.PaymentFailedException;
import prep.karat.payment.impl.CreditCardPayment;
import prep.karat.payment.impl.UPIPayment;

public class Payment {

	public static void main(String[] args) {
		PaymentMethod cCPayment = new CreditCardPayment("AXIS1234");
		
		PaymentMethod upiPayment = new UPIPayment("HDFC65432");
		try {
			cCPayment.pay(1000);
			
			upiPayment.pay(-100);
		} catch (PaymentFailedException e) {
			e.printStackTrace();
		}
	}
}
