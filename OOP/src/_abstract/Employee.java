package _abstract;

public class Employee extends Person implements Readable{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void Hoc() {
        System.out.println("Hoc cac nghiep vu ho tro cho cong viec");
    }

    @Override
    public void readBook() {
        System.out.println("Nhan vien doc cac sach ve nghiep vu");
    }
}
