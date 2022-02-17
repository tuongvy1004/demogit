package kethua;

public class Main {
    public static void main(String[] args) {
        //Hyundai hyundai = new Hyundai();
       // hyundai.model
        //xác định tính đa hình
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
//
//        Vehicle hyundai2 = new Hyundai();
//        hyundai2.moveOnStreet();
//        hyundai2.numberOfSeat();
//
//        Hyundai hyundai = new Hyundai();
//        hyundai.moveOnStreet();
//        hyundai.numberOfSeat();

        Hyundai hyundai1 = new Hyundai();

        //ÉP KIỂU OBJECT
        //Hyundai vehicle3 = (Hyundai) new Vehicle();
        hyundai1.print();
        hyundai1.numberOfSeat();
        //hyundai1.name("h");


    }
}
