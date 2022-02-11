package MyGeneric;

public class GenericExample2 {
    //    public static void printElement (Object[] objects){
//        for(Object o:objects){
//            System.out.print(o);
//        }
//        System.out.println();
//    }
//
//
//    public static void main(String[] args) {
//        Integer[] myArrInt = {1,2,3,4};
//        Double[] myArrDouble = {1.1, 2.2, 3.3, 4.4};
//        String[] myArrStr = {"A","B", "C", "D"};
//        printElement(myArrInt);
//        printElement(myArrDouble);
//        printElement(myArrStr);
//    }

    public static <T> void printElement (T[] t){
        for(T o:t){
            System.out.print(o);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Integer[] myArrInt = {1,2,3,4};
        Double[] myArrDouble = {1.1, 2.2, 3.3, 4.4};
        String[] myArrStr = {"A","B", "C", "D"};
        printElement(myArrInt);
        printElement(myArrDouble);
        printElement(myArrStr);
    }
}
