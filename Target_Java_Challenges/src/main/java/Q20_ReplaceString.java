import java.util.Scanner;

public class Q20_ReplaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.nextLine();
        str = str.replace('a', '$');
        System.out.println("New string is: "+str);

    }
}
