import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        //add(): thêm phần tử
        myList1.add("a");
        myList1.add("b");
        myList1.add("c");


        //size: tổng số phần tử của tập hợp
        System.out.println("Tổng số phần tử: " + myList1.size());
        //addAll: thêm tất cả phần tử list A vao list B
        List<String> myList2 = new ArrayList<>();
        myList2.add("e");
        myList2.add("f");
        myList1.addAll(myList2);

        //get: lấy giá trị phần tử theo index
        System.out.println(myList1.get(0  ));

        //set: cập nhật lại giá trị
        myList1.set(0, "new element");

        //indexOf: trả về index của phần tử cần tìm
        System.out.println(myList1.indexOf("b"));

        //lastIndexOf: trả về index cuối cùng của phần tử cần tìm
        myList1.add("b");
        System.out.println(myList1.lastIndexOf("b"));

        //remove: xóa phần tử
        myList1.remove(2);

        //clear: xóa toàn bộ
   //     myList1.clear();

        //contains: kiểm tra xem phần tử có trong tập hợp không
        System.out.println(myList1.contains("f"));

        //sublist: tạo tập hợp mới từ tập hợp cho trước
        List<String> newList = myList1.subList(1,3);

        // duyệt các phần tử
        System.out.println("----------");
        for (String element: myList1){
            System.out.print(element + "\t");
        }
        System.out.println("----------");
        for (String element: newList){
            System.out.print(element + "\t");
        }

    }
}
