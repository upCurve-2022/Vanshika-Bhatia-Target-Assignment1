import java.util.Scanner;

public class Q11_Sequence1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        for (int i=2; i<=num; i= i+2){
            System.out.print(i*i + " ");
        }
    }
}
