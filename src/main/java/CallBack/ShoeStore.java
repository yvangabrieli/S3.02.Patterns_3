package CallBack;

public class ShoeStore {

    public static void main(String[] arg) {
        PaymentMethod paypal = new PayPalPayment();
        PaymentMethod debit = new DebitCardPayment();
        PaymentMethod credit = new CreditCardPayment();
        PaymentGateway pay = new PaymentGateway();
        pay.processPayment(paypal);
        pay.processPayment(debit);
        pay.processPayment(credit);
    }
}
