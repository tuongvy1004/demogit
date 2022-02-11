package MyFile.model;

public class Student {
    private Integer id;
    private String name;
    private String dataOfBirth;

    public Student(){

    }
    public Student(Integer id, String name, String dataOfBirth){
        this.id = id;
        this.name = name;
        this.dataOfBirth = dataOfBirth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }
}
