package ArrayList;
import java.util.Arrays;

public class MyArrayList {

    //Số lượng phần tử trong MyArrayList
    private int size =0;

    //Sức chứa mặc định trong MyArrayList
    private static final int DEFAULT_CAPACITY = 10;

    //mảng đối tượng element chứa các phần tử trong MyArrayList
    private Object[] elements;

    //phương thức khởi tạo không tham số
    public MyArrayList(){
        System.out.println("Khởi tạo MyArrayList có kích thước là: "+ DEFAULT_CAPACITY);
        elements = new Object[DEFAULT_CAPACITY];
    }
}
