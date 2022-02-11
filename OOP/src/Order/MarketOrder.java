package Order;

public class MarketOrder extends Order{
    @Override
    public void validate() {
        System.out.println("Market Order is validation");
    }

    @Override
    public void process() {
        System.out.println("Market Order is processing");
    }
}
