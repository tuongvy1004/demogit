package dowhile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1. Tính tổng các số đã nhập đến 0 thì dừng
        int number, sum =0;

        //tạo object của lớp Scanner
        Scanner input = new Scanner(System.in);

        //dùng do while để nhập giá trị
        do {
            //lấy input từ bàn phím
            System.out.println("Enter a number");
            number = input.nextInt();
            sum +=number;
        }while(number!=0);
        System.out.println("Sum: "+sum);
    }
}
