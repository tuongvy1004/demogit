import java.util.Iterator;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        //trả về phần tử đầu stack: peek
     //   System.out.println(myStack.peek());

        //pop:lấy và xóa
      //  System.out.println(myStack.pop());
        //search
        System.out.println(myStack.search(2));
        //size
        System.out.println("size: "+ myStack.size());

        //duyệt
        Iterator<Integer> iterator = myStack.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
    }
}
