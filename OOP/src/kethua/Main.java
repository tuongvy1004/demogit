package kethua;

public class Main {
    public static void main(String[] args) {
        //Hyundai hyundai = new Hyundai();
       // hyundai.model
        Vehicle vehicle;
        String inputString = "lambo";
        if (inputString.equals("toyota")){
            //tạo object tương ứng
            vehicle = new Toyota();
        } else if (inputString.equals("lambo")){
            vehicle = new Lamborghini();
        } else {
            vehicle = new Hyundai();
        }
        vehicle.moveOnStreet();

    }
}
