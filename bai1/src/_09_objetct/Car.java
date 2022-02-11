package _09_objetct;

public class Car {
    int modelYear;
    String modelName;

    public void run(){
        System.out.println("My car "+ modelName + "is running" );
    }

    public Car (int year, String name){
        this.modelYear = year;
        this.modelName = name;
    }

    public static void main(String[] args) {
        Car myCar = new Car(1986, "BMW");
        System.out.println(myCar.modelYear + " " + myCar.modelName);

        Car myCar2 = new Car(1976, "Cadillac");
        System.out.println(myCar2.modelYear + " " + myCar.modelName);
    }
}
