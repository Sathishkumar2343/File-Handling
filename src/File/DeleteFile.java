package File;
import java.io.File;
public class DeleteFile {
    public static void main(String[] args) {
        File obj = new File("C:\\Users\\ELCOT\\Desktop\\HU\\text.txt");
        if (obj.delete()){
            System.out.println("file Deleted");
        }else{
            System.out.println("Error Ocuured");
        }
    }
}
