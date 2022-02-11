package ArrayList;

import java.util.ArrayList;

public class TestMyArrayList {
    static class Person{
        String name;
        int Age;

        Person(String name, int age){
            this.name = name;
            Age = age;
        }

        @Override
        public String toString(){
            return "Person{"+
                    "name='"+ name + '\'' +
                    ", Age=" + Age +
                    '}';
        }
    }

    public static void main(String[] args) {
       // ArrayList<Person> myArrayList = new ArrayList<>();
        MyArrayList myArrayList = new MyArrayList();


    }
}
