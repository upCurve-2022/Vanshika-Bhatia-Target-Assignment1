import java.util.Scanner;

public class Q17_PrimeNum {
    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n = sc.nextInt();
        System.out.print("Enter second number: ");
        int m = sc.nextInt();
        for (int i = n; i <= m; i++) {
            if (prime(i)) {
                System.out.println(i);
            }
        }
    }
}
