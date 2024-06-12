package File;
import  java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        try {
            FileWriter obj = new FileWriter("C:\\Users\\ELCOT\\Desktop\\HU\\text.txt");
            obj.write("This is a simple File");
            obj.close();
        }catch (IOException e){
            System.out.println("Error occured");
        }

    }
}
