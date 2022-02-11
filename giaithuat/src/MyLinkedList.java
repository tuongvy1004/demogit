public class MyLinkedList {
    private class Node{
        private Node next;
        private Object data;

        public Node (Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }
    private Node head;
    private int numNodes = 0;

    //phương thức trả về số phần tử trong ds
    public int size(){
        return numNodes;
    }
    //phương thức trả về data theo index
    public Object get (int index){
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp.data;
    }
    //phương thức kiểm tra phần tử có tồn tại trong ds hay không
//    public boolean contains(E element){
//        Node temp = head;
//        while (temp.next!=null){
//            if(temp.data.equals(element)){
//                return true;
//            }
//            temp = temp.next;
//        }
//        //temp đang ở vị trí cuối cùng
//        if(temp.data.equals(element)){
//            return true;
//        }
//        return false;
//    }
}
