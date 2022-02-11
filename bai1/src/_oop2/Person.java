package _oop2;

public class Person {
    private String name;
    private int age;
    private Flour flour;
    public void makeBakery(Flour flour){
        System.out.println("Alex is making a bakery with " + flour.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Flour getFlour() {
        return flour;
    }

    public void setFlour(Flour flour) {
        this.flour = flour;
    }
}
