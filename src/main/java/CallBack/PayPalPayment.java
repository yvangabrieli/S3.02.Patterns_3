package CallBack;

public class PayPalPayment implements PaymentMethod {
    public void makePayment(){
        System.out.println("Paying with PayPal");
    }
}
