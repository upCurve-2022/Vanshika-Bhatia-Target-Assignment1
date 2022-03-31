import java.util.Scanner;

public class Q25_StringReverse {
    static String stringReverse(String s){
        String rev = "";
        for(int i=s.length()-1; i>=0;i--){
            rev += s.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s = sc.next();
        System.out.println("Reversed string is: " + stringReverse(s));
    }
}
