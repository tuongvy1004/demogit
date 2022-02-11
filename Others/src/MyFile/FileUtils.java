package MyFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static void writeFile(String pathFile, String line){
        try {
            FileWriter fileWriter = new FileWriter(pathFile, true);
            //viết vào file
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(line);
            //tự động xuống dòng
            bufferedWriter.newLine();
            //đóng file để lưu dữ liệu
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //tạo List:để đọc từng dòng
    public static List<String> readFile(String pathFile){
        List<String> listLine = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFile);
           //hỗ trợ đọc từng dòng
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;

            //while: đọc từng line đến line cuối
            while((line = bufferedReader.readLine()) != null){
                listLine.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLine;
    }
}
