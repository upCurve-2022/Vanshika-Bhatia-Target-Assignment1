import java.util.Scanner;

public class Q26_Pallindrome {
    static boolean palindrome(String s){
        for (int i=0,j=s.length()-1; i<j; i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s = sc.next();
        if(palindrome(s)){
            System.out.println("String is palindrome.");
        }
        else {
            System.out.println("String is not a palindrome.");
        }

    }
}
