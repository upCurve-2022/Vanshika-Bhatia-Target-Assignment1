import java.util.Scanner;

public class Q7_LargestNum {
    //Function to find first and second largest number
    static void checkLargest(int first, int second, int third) {
        if (first > second && first > third) {
            System.out.println(first + " is the largest number.");
        } else if (second > first && second > third) {
            System.out.println(second + " is the largest number.");
        } else if (third > first && third > second) {
            System.out.println(third + " is the largest number.");
        }
        if (first > second && first < third || first < second && first > third) {
            System.out.println(first + " is the second largest number.");
        } else if (second > first && second < third || second < first && second > third) {
            System.out.println(second + " is the second largest number.");
        } else if (third > first && third < second || third < first && third > second) {
            System.out.println(third + " is the second largest number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNum = sc.nextInt();
        System.out.println("Enter second number:");
        int secondNum = sc.nextInt();
        System.out.println("Enter third number:");
        int thirdNum = sc.nextInt();
        checkLargest(firstNum, secondNum, thirdNum);
    }
}
