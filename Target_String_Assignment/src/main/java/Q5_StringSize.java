import java.util.Scanner;

public class Q5_StringSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.nextLine();
        int length = str.length();
        System.out.println("Length of string is: "+length);
    }
}
