import java.util.Scanner;

public class Q1_ImmutableString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first String: ");
        String str1 = sc.nextLine();
        System.out.println();
        System.out.print("Enter your second String: ");
        String str2 = sc.nextLine();
        str1.concat(str2);
        System.out.println("Printing First string after concatenating second " + str1);
        System.out.println("It still prints the same first string means strings are immutable");

    }
}
