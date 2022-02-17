package inherritance;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Person student = new Student ("Vy", "QN", "CHINH QUY", 4, 9.5);
        Person staff = new Staff("Lê", "Hue", "KHTN", 12.5);

        //System.out.println(student.getRating());
        System.out.println(((Student)student).getRating());
        //System.out.println(staff.upToSalary(40));
        System.out.println(((Staff)staff).upToSalary(40));
    }


}
