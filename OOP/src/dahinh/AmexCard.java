package dahinh;

public class AmexCard implements PaymentGateway{
    @Override
    public void payment() {
        System.out.println("Payment with amex card");
    }
}
