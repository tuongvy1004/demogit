package _abstract;

public class Student extends Person implements Readable, Playable {
    private String className;
    private double grade;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public void Hoc() {
        System.out.println("Tham khao giao trinh");
    }

    @Override
    public void readBook() {
        System.out.println("Sinh viên đọc sách khoa học");
    }

    @Override
    public void playGame() {
        System.out.println("Sinh viên chơi game LOL");
    }
}
