import java.util.Scanner;

public class Q4_ASCII {
    static void printASCII(char character){
        System.out.println((int)character);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);
        printASCII(ch);
    }
}
