import java.util.ArrayList;
import java.util.List;

public class MyArrayList2 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        int number1  =9;
        //add kiểu dữ lieju nguyên thủy đã được auto-boxing
        arrayList.add(number1);
        for(int number: arrayList){
            System.out.println(number);
        }
    }
}
