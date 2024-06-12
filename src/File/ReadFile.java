package File;

import java.io.FileNotFoundException;
import java.io. File;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try{
            File obj = new File("C:\\Users\\ELCOT\\Desktop\\HU\\text.txt");
            Scanner reader = new Scanner(obj);
            while (reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
        }catch(FileNotFoundException e){
            System.out.println("Error");
        }
    }
}
