import java.util.Scanner;

public class Q12_Sequence2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int j = 3;
        for (int i=3; i<=num; i=i+2){
            System.out.print(i*i + " ");
        }
    }
}
