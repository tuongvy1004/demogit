import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Pig");



        //thêm phần tử sử dụng chỉ số
       // animals.add(3, "Kitchen");

        //addAll
        LinkedList<String> animals2 = new LinkedList<>();
        animals2.add("Cat");
        animals2.add("Cow");

        System.out.println("-----");

        String str =animals.get(0);
        System.out.println("Element 1:" + str);

        //contains: kiểm tra xem phần tử có trong tập hợp không
        System.out.println(animals.contains("Cat"));

        //indexOf: trả về chỉ số xuất hiện đầu tiên của phần tử
       // System.out.println(animals.indexOf("Cat"));

        animals.addAll(animals2);
        //get:lấy giá trị phần tử theo index
         System.out.println("Lấy giá trị phần tử đầu tiên");
         System.out.println(animals.get(0));
        //set
        System.out.println(animals.set(0, "Tiger"));

        //remove
        System.out.println(animals.remove(0));

        //addFirst
        animals.addFirst("Tiger");

        //addLast
        animals.addLast("Monkey");

        //removeFirst
        animals.removeFirst();
        //removeLast
        animals.removeLast();
        //duyệt các phần tử
        System.out.println("------");
//        for (String element:animals ){
//            System.out.println(element + "\t");
//        }

//        for (int i=0; i< animals.size(); i++){
//            System.out.println(animals.get(i) + "\t");
//        }

        Iterator<String> iterate = animals.iterator();
        while (iterate.hasNext()){
            System.out.println(iterate.next() + "\t");
        }

        System.out.println(animals.lastIndexOf("Cat"));

        System.out.println("Trả về phần tử đầu tiên");
        System.out.println(animals.getFirst());
        //System.out.println(animals.peek());

        System.out.println("Trả về phần tử cuối cùng");
        System.out.println(animals.getLast());


    }
}
