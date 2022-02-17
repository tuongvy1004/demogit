package inherritance;

public class Staff extends Person{
    String school;
    Double salary;

    public Staff(String name, String address, String school, Double salary) {
        super(name, address);
        this.school = school;
        this.salary = salary;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public double upToSalary(int percent){
        return this.salary + (this.salary*percent)/100;
    }
}
