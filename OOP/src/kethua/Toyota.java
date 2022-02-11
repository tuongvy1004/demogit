package kethua;

public class Toyota extends Vehicle {
    public boolean switchingLight;
    public Toyota(){

    }

    @Override
    public void moveOnStreet() {
        System.out.println("Toyota Moving 50 miles ......");
    }
}
