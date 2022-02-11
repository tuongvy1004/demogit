import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> myTreeMap = new TreeMap<>();

        myTreeMap.put(2,"two");
        myTreeMap.put(1,"one");
        myTreeMap.put(3,"three");

        //get
        System.out.println(myTreeMap.get(2));
        //cập nhật lại giá trị: put
        myTreeMap.put(2,"new value");
        //xóa
        myTreeMap.remove(2);
        //duyệt các phần tử
        for(Map.Entry<Integer,String> entry: myTreeMap.entrySet()){
            System.out.println(entry.getKey()+ " "  + entry.getValue());
        }
    }
}
