package CallBack;

public class DebitCardPayment implements PaymentMethod {
    public void makePayment(){
        System.out.println("Paying with Debit Card");
    }
}
