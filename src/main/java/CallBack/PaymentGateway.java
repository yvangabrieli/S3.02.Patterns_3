package CallBack;

public class PaymentGateway {
    PaymentMethod payment;

    public PaymentGateway() {
        this.payment = payment;
    }
    public void processPayment(PaymentMethod payment){
        System.out.print("Payment is processing... ");
        payment.makePayment();
        }
    }
