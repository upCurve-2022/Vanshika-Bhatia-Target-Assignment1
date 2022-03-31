import java.io.File;
import java.io.IOException;

public class Q8_FileCreation {
    public static void main(String[] args) {
        try {
            File myFile = new File("myFile.txt");
            if(myFile.createNewFile()){
                System.out.println("File created");
            }
            else{
                System.out.println("File already exist");
            }
        } catch (IOException e) {
            System.out.println("Unable to create");
            e.printStackTrace();
        }
    }
}
