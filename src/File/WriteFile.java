package File;
import java.io.File;
import  java.io.IOException;
public class WriteFile {
    public static void main(String[] args) {
        try{
            File obj = new File("C:\\Users\\ELCOT\\Desktop\\HU\\text.txt");
            if (obj.createNewFile()){
                System.out.println("New File Created " + obj.getName());
            }else
            {
                System.out.println( "File already exists");
            }
        }catch(IOException e){
            System.out.println("Error Occured");
        };
    }
}
