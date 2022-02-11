package dahinh;

public class MasterCard implements PaymentGateway{
    public void payment(){
        System.out.println("Payment with master card");
    }
}
