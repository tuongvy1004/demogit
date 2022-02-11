package MyGeneric;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MyException {
    public static void print(){
        print();
    }

    public static void main(String[] args) throws FileNotFoundException {
        try{
            int zero = 0;
            int result = 10/zero;
            System.out.println("Result: "+result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Đây là khối finally");
        }
        System.out.println("Chương trình kết thúc");


       // FileReader f = new FileReader("FileReader.json");
    }
}
