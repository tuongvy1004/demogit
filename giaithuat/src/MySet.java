import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        //add
        mySet.add("element 1");
        mySet.add("element 2");
        mySet.add("element 3");

        //duyệt các phần tử bằng iterator và forEach
//        for(String element:mySet){
//            System.out.println(element);
//        }



        //addAll
        Set<String> mySet2 = new HashSet<>();
        mySet2.add("element 4");
        mySet2.add("element 5");
        mySet.addAll(mySet2);

        System.out.println("------");
        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //size
        System.out.println(mySet.size());

        //isEmpty
        System.out.println(mySet.isEmpty());

        //contain: kiểm tra sự tồn tại
        System.out.println(mySet.contains("element 2"));
    }
}
