import java.util.Scanner;

public class Q19_UglyNum {
    static boolean uglyNum(int n) {
        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n==1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        boolean res = uglyNum(num);
        if(res){
            System.out.println("This is an ugly number");
        }
        else {
            System.out.println("This is not an ugly number");
        }
    }
}
