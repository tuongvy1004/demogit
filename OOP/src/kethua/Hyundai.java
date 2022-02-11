package kethua;

public class Hyundai extends Vehicle{
    private String autoBrake;
    public Hyundai(){

    }

    @Override
    public void moveOnStreet() {
        System.out.println("Hyundai is moving 100 miles/hour ...");
    }
}
