import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class MyDeque {
    public static void main(String[] args) {
        /*
        implementation của Deque: LinkedList, ArrayDeque
         */
        Deque<Integer> myDeque = new LinkedList<>();

        myDeque.add(1);
        myDeque.add(2);
        myDeque.addFirst(0);
        myDeque.addLast(3);
        myDeque.offerLast(4);
        //thêm vao đầu
        myDeque.push(5);
        myDeque.offerFirst(6);

        //truy xuất phần tủ
        System.out.println("Truy xuất phần tử");
        System.out.println(myDeque.peek());
        System.out.println(myDeque.peekFirst());
        System.out.println(myDeque.getFirst());

        //truy xuất phần tử cuối ds
        System.out.println("Truy xuất phần tử cuối ds");
        System.out.println(myDeque.peekLast());
        System.out.println(myDeque.getLast());

        //xóa
        System.out.println("Xóa phần tử đầu ds");
        System.out.println(myDeque.remove());

        System.out.println("Xóa cuối ds");
        System.out.println(myDeque.pollLast());

        //kiểm tra phần tử có tồn tại trong ds
        System.out.println(myDeque.contains(5));

        Iterator<Integer> iterator = myDeque.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + "\t");
        }
    }
}
