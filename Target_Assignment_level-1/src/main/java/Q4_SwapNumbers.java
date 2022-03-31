import java.util.Scanner;

public class Q4_SwapNumbers {
    //Function to swap 2 numbers
    static void swapTwoNum(int x, int y) {
        System.out.println("\tSwapping 2 numbers\t");
        System.out.println("Before Swapping...");
        System.out.println("First no. = " + x);
        System.out.println("Second no. = " + y);
        int temp1 = x;
        x = y;
        y = temp1;
        System.out.println("After Swapping...");
        System.out.println("First no. = " + x);
        System.out.println("Second no. = " + y);
    }

    //Function to swap 3 numbers
    static void swapThreeNum(int x, int y, int z) {
        System.out.println("\tSwapping 3 numbers\t");
        System.out.println("Before Swapping...");
        System.out.println("First no. = " + x);
        System.out.println("Second no. = " + y);
        System.out.println("Third no. = " + z);
        int temp2 = x;
        x = z;
        z = y;
        y = temp2;
        System.out.println("After Swapping...");
        System.out.println("First no. = " + x);
        System.out.println("Second no. = " + y);
        System.out.println("Third no. = " + z);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:");
        int firstNum = sc.nextInt();
        System.out.println("Enter Second number:");
        int secondNum = sc.nextInt();
        System.out.println("Enter Third number:");
        int thirdNum = sc.nextInt();
        swapTwoNum(firstNum, secondNum);
        swapThreeNum(firstNum,secondNum,thirdNum);
    }
}
