import java.util.Locale;
import java.util.Scanner;

public class Q11_StringUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        String sUppercase = s.toUpperCase(Locale.ROOT);
        System.out.println("Uppercase: " + sUppercase);
    }
}
