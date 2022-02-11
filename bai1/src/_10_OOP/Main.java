package _10_OOP;

public class Main {

    public static void main(String[] args) {
        //khai bao doi tuong alex
        Person alex = new Person();
        alex.setName("Alex");
        alex.setAge(25);

        //khai bao doi tuong bot flourBake
        Flour flourBake = new Flour();
        flourBake.setName("bot mi");
        flourBake.setSize(1);

        //set loai bot nay cho alex
      //  alex.setFlour(flourBake);

        alex.makeBakery(flourBake);
    }
}
