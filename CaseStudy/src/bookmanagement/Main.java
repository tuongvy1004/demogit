package bookmanagement;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    //task 3
    public static final String FILE_NAME = "src/bookmanagement/data/Book.csv";
    public static final String FILE_NAME1 = "src/bookmanagement/data/Dodunghoctap.csv";
    public static final String FILE_NAME2 = "src/bookmanagement/data/Dochoitreem.csv";
    public static final String FILE_NAME3 = "src/bookmanagement/data/Khachhang.csv";
    public static final String FILE_NAME4 = "src/bookmanagement/data/Donhang.csv";
    public static final String COMMA = ",";

    public static void createFile(String FILE_NAME ){
        // Create file
        try{
            File f = new File(FILE_NAME);

            if(f.createNewFile()){
                System.out.println("File create: "+ f.getName());

            }
            else{
                System.out.println("File already exists.");
            }
        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //task 2
        Scanner scanner = new Scanner(System.in);
        MainMenuControll mainMenuControll = new MainMenuControll();
        while (true){
            System.out.println("Please enter: ");
            System.out.println("1. Add product");
            System.out.println("2. Add order");
            System.out.println("3. Show information");


        }

        //task 3
//        createFile(FILE_NAME);
//        createFile(FILE_NAME1);
//        createFile(FILE_NAME2);
//        createFile(FILE_NAME3);
//        createFile(FILE_NAME4);
    }
}
