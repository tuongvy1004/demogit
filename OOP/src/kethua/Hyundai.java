package kethua;

public class Hyundai extends Vehicle{
    private String autoBrake;
    public Hyundai(){

    }

    @Override
    public void moveOnStreet() {
        System.out.println("Hyundai is moving 100 miles/hour ...");
    }
    //@Override
    public void numberOfSeat(){
     //super.numberOfSeat();
    System.out.println("Number of seat: 5");
    }
    public void print(){
        super.numberOfSeat();
    }
    public void printNotSuper(){
        numberOfSeat();
    }

}
