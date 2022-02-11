import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        /*
        implementation của Queue:
        LinkedList
        PriorityQueue
        ArrayQueue
         */
        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("a");
        myQueue.offer("b");
        //lấy ra phần tử đầu hàng đợi
        System.out.println(myQueue.peek());
        System.out.println(myQueue.element());

        //lấy ra phần tử dầu hàng đợi và xóa nó
       // System.out.println(myQueue.poll());
       // System.out.println(myQueue.remove());

        //clear
        //myQueue.clear();
        //kiểm tra hàng đợi có rỗng hay không
        System.out.println(myQueue.isEmpty());

        //kiểm tra phần tử đã có trong hàng đợi
        System.out.println(myQueue.contains("b"));

        //trả về kích thước
        System.out.println(myQueue.size());

        //duyệt
        for (String element: myQueue){
            System.out.println(element + "\t");
        }
    }
}
