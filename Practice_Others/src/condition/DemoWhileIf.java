package condition;

import java.util.Scanner;

public class DemoWhileIf {
    public static void main(String[] args) {
        float x;
        do {
            Scanner ip= new Scanner(System.in);
            System.out.println("Moi Ban Nhap Diem Trung Binh: ");
            x = ip.nextFloat();

        } while (x < 0 || x>10);
        if(x>9.5f)
            System.out.println("Loai Xuat Sac");
        else if( x>=8.6f)
            System.out.println("Loai Gioi");
        else if( x>=6.7f)
            System.out.println("Loai Kha");
        else if( x>=5.0f)
            System.out.println("Loai Trung binh");
        else
            System.out.println("Loai Yeu");

    }
}
