import java.io.FileOutputStream;
import java.io.IOException;

public class Q9_WriteToFile {
    public static void main(String[] args) {
        try{
            String st = "This is my First File. Writing using FileOutputStream.";
            FileOutputStream fOut = new FileOutputStream("myFile.txt");
            for(int i =0;i<st.length();i++){
                fOut.write(st.charAt(i));
            }

            fOut.close();
        }
        catch (IOException e){
            System.out.println("Exception occurred");
            e.printStackTrace();
        }

    }
}
