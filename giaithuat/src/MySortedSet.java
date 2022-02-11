import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MySortedSet {
    public static void main(String[] args) {
        //implement của SortedSet: treeset
        TreeSet sortedSet = new TreeSet();

        //thêm phân tử
        sortedSet.add("a");
        sortedSet.add("c");
        sortedSet.add("b");

        //xóa
       // sortedSet.remove("c");
        //lấy phần tử đầu tiên
        System.out.println(sortedSet.first());
        //lấy phần tử cuối cùng
        System.out.println("----");
        System.out.println(sortedSet.last());

        //duyệt

        System.out.println("----");
        Iterator iterator = sortedSet.iterator();
        //hasNext: kiểm tra có phần tử trong iterator hay không
        while (iterator.hasNext()){
            System.out.println((String)iterator.next());
        }

        //sắp xếp giảm dàn
        System.out.println("-----");
        Iterator iterator1 = sortedSet.descendingIterator();
        //hasNext: kiểm tra có phần tử trong iterator hay không
        while (iterator1.hasNext()){
            System.out.println((String)iterator1.next());
        }
        //headSet: lấy phần tử từ đầu đến phần tử cho trước
        SortedSet headSet = sortedSet.headSet("c");
        System.out.println("Lấy headSet");
        Iterator iterator2 = headSet.iterator();
        //hasNext: kiểm tra có phần tử trong iterator hay không
        while (iterator2.hasNext()){
            System.out.println((String)iterator2.next());
        }
        //tailSet: lấy từ X đến cuối
        SortedSet tailSet = sortedSet.tailSet("b");
        System.out.println("Lấy tailSet");
        Iterator iterator3 = tailSet.iterator();
        //hasNext: kiểm tra có phần tử trong iterator hay không
        while (iterator3.hasNext()){
            System.out.println((String)iterator3.next());
        }
    }




}
