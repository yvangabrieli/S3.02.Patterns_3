package CallBack;

public class CreditCardPayment implements PaymentMethod {
    public void makePayment(){
        System.out.println("Paying with Credit Card.");
    }
}
