import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyCollection {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        Collections.addAll(myList, 2,1,5,4,6);
        System.out.println(myList.toString());

        //sort
        Collections.sort(myList);
        System.out.println(myList.toString());

        //tìm kiếm
        System.out.println(Collections.binarySearch(myList, 4));

        //đảo ngược
        Collections.reverse(myList);
        System.out.println(myList.toString());

        //xáo trộn
        Collections.shuffle(myList);
        System.out.println(myList.toString());
        Collections.shuffle(myList);
        System.out.println(myList.toString());
        //thay thế
        Collections.replaceAll(myList, 1, 100);
        System.out.println(myList.toString());
    }
}
