package _10_OOP;

public class Person {
    private String name;
    private int age;
    private Flour flour;

    public void makeBakery(Flour flour){

        System.out.println("Alex is making bakery with " + flour.getName());
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void  setName(String name){
        this.name = name;
    }

    public void setFlour(Flour flour) {
        this.flour = flour;
    }

    public Flour getFlour() {
        return flour;
    }
}
