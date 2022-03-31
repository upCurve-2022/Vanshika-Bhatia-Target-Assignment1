import java.util.Scanner;

public class Q18_factorial {
    static int factorial(int n){
        int result = 1;
        for(int i= 1; i<n+1; i++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int N = sc.nextInt();
        System.out.printf("Factorial of %d is: %d",N,factorial(N));;
    }
}
