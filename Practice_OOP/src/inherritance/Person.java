package inherritance;

public class Person {
    private String name;
    private String address;

    //constructor
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
