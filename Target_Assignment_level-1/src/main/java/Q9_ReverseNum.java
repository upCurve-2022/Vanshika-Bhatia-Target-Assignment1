import java.util.Scanner;

public class Q9_ReverseNum {

    static void reverse(String num) {
        String reversedNum = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            reversedNum += num.charAt(i);
        }
        int reverse = Integer.parseInt(reversedNum);
        System.out.println("Reversed number is: " + reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        String number = Integer.toString(num);
        reverse(number);
    }
}
