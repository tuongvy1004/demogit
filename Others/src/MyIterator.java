import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyIterator {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        System.out.println(myList);

        Iterator<Integer> iterator = myList.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        while (iterator.hasNext()){
            Integer element = iterator.next();
            if(element<=3){
                iterator.remove();
            }
        }
        System.out.println(myList);
    }
}
