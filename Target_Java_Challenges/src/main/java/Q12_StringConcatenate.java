import java.util.Scanner;

public class Q12_StringConcatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String string1 = sc.nextLine();
        System.out.println("Enter second String: ");
        String string2 = sc.nextLine();
        String stringConcat = string1.concat(string2);
        System.out.println(stringConcat);
    }
}
