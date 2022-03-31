import java.util.Scanner;

public class Q5_PerfectSquare {
    static void perfectSquare(int num) {
        if (Math.sqrt(num) == (int) Math.sqrt(num)) {
            System.out.println("This number is a perfect square");
        } else {
            System.out.println("This number is not a perfect square");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        perfectSquare(n);
    }
}


////
//        public static void main(String[] args) {
//
//        }