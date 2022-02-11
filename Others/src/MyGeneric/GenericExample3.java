package MyGeneric;

import java.util.ArrayList;
import java.util.List;

public class GenericExample3 {
    public static void printElement(List<? extends String> list){
        for(Object o:list){
            System.out.print(o.toString()+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> myListInt = new ArrayList<>();
         myListInt.add(1);
         myListInt.add(2);

         List<Double> myListDou = new ArrayList<>();
         myListDou.add(1.1);
         myListDou.add(1.2);

         List<String> myListStr = new ArrayList<>();
         myListStr.add("A");
         myListStr.add("B");

        // printElement(myListInt);
         //printElement(myListDou);
         printElement(myListStr);
    }
}
