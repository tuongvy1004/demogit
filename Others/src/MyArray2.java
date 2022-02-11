public class MyArray2 {
    static class Student{
        private String name;
        private int age;
        public Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName(){
            return name;
        }
    }

    public static void main(String[] args) {
        Student[] arrStudent = new Student[2];
        arrStudent[0] = new Student("Nam", 8);
        arrStudent[1] = new Student("Nu", 9);

        for(Student student : arrStudent ){
            System.out.println(student.getName());
        }
    }
}
