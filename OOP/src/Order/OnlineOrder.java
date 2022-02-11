package Order;

public class OnlineOrder extends Order {

    private  String couponCode;
    @Override
    public void validate() {
        System.out.println("Online order is validation");
    }

    @Override
    public void process() {
        System.out.println("Online order is processing");

    }
}
