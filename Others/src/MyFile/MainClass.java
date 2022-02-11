package MyFile;

import MyFile.model.Student;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static final String FILE_NAME = "src/MyFile/data/student.csv";
    public static final String COMMA = ",";
    public static void main(String[] args) {
        //Output file
//        Student student1 = new Student(1, "Huong", "1/1/2000");
//        Student student2 = new Student(2, "Lan", "2/2/2000");
//        Student student3 = new Student(3, "Ngoc", "3/3/2000");
//
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
//
//        String line = null;
//        for(Student student: studentList){
//            line = student.getId() + COMMA + student.getName() + COMMA + student.getDataOfBirth();
//            FileUtils.writeFile(FILE_NAME, line);
//        }

        //Input file
        List<String> listLine = FileUtils.readFile(FILE_NAME);
        System.out.println(listLine);

        String[] lineSplit = listLine.get(0).split(COMMA);
        Student student1 = new Student(Integer.parseInt(lineSplit[0]), lineSplit[1], lineSplit[2]);
        System.out.println(student1.getId()+ " " +student1.getName() + " " + student1.getDataOfBirth());
    }
}
