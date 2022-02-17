package manager.officer;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ManagerOfficer {
    // tạo ArrayList để lưu danh sách cán bộ hoặc tạo objecy
    List<Officer> listOfficer = new ArrayList<>();
    // tạo method thêm mới cán bộ

    public void addOfficer(Officer officer){
        this.listOfficer.add(officer);
    }

    public List<Officer> searhOfficeByName(String name){
        return this.listOfficer.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }
    public void showListInfoOfficer(){
        this.listOfficer.forEach(o -> System.out.println(o.toString()));
    }

}
