package _oop2;

public class Main {
    public static void main(String[] args) {
        Person alex = new Person();
        alex.setName("Alex");
        alex.setAge(25);

        Flour flourBake = new Flour();
        flourBake.setName("bot mi");
        flourBake.setSize(1);

        alex.setFlour(flourBake);

        alex.makeBakery(flourBake);
    }

}
