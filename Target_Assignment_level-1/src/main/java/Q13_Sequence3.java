import java.util.Scanner;

public class Q13_Sequence3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int res = i;
            for (int j = i; j > 1; j--) {
                res *= i;
            }System.out.print(res + " ");
        }
    }
}