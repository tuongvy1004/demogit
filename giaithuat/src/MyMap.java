import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        Map<Integer,String> myMap  = new HashMap<>();
        //put:thêm phần tử

        myMap.put(1,"one");
        myMap.put(2,"two");
        myMap.put(3,"three");

        //get:lấy ra giá trị của key
        //System.out.println(myMap.get(3));

        //putAll: thêm phần tử từ Map khác
        Map<Integer,String> myMap2  = new HashMap<>();
        myMap2.put(4,"four");
        myMap2.put(5,"five");
        myMap.putAll(myMap2);
        //remove: xóa phần tử khỏi Map
         myMap.remove(4);

        //clear: xóa hết
      //  myMap.clear();
        //size: trả về kích thước của Map
        System.out.println(myMap.size());
        //duyệt các phần tử trong Map
        //keySet: lấy ra ds key
        for (Integer key: myMap.keySet()){
            System.out.println(myMap.get(key));
        }

        //constainKey: kiểm tra Map chứa key đã tồn tại
        System.out.println(myMap.containsKey(5));

        //constainValue: kiểm tra Map chứa Value đã tồn tại
        System.out.println(myMap.containsValue("six"));

    }
}
