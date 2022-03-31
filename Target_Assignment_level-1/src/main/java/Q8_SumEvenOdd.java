import java.util.Scanner;

public class Q8_SumEvenOdd {
    static int sumEven(int n) {
        int evenSum = 0;
        for (int i = 0; i < n + 1; i += 2) {
            evenSum += i;
        }
        return evenSum;
    }

    static int sumOdd(int n) {
        int oddSum = 0;
        for (int i = 1; i < n + 1; i += 2) {
            oddSum += i;
        }
        return oddSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int N = sc.nextInt();
        System.out.println("Sum of even numbers is: " + sumEven(N));
        System.out.println("Sum of odd numbers is: " + sumOdd(N));

    }

}
