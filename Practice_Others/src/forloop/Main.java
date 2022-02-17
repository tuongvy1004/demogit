package forloop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Viết chương trình tính tổng các số nguyên từ 1 đến 10
        int sum =0;
        for(int i=1; i<=10; i++ ){
            sum = sum + i;
        }
        System.out.println("Tong 1 đến 10: "+sum);

        //2.Viết chương trình tìm số nguyên a trong mảng arr cho trước
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int a =4;
        for (int i=0; i< arr.length; i++){
            if(arr[i] == a){
                System.out.println("Vị trí: "+i);
                break;
            }

        }
        //3. Viết chương trình đảo ngược mảng a cho sẵn
        int arr1[] = {1,2,3,4,5,6,7,8,9};
        for(int i= arr1.length-1; i>=0; i-- ){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        //4.for lồng nhau
        int number1, number2;
        Scanner scanner = new Scanner(System.in);

        // Vòng lặp for bên ngoài thực thi 3 lần với 3 row = 1, 2, 3.
        for (number1 = 1; number1 <= 3; number1++) {
            // Mỗi lần lặp for bên ngoài
            // thì vòng lặp for trong sẽ thực thi 2 lần với 2 col = 1, 2.
            for (number2 = 1; number2 <= 2; number2++) {
                System.out.println("number1 = " + number1 + ", number2 = " + number2);
            }
        }

    }
}
