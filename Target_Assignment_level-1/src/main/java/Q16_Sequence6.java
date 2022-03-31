import java.util.Scanner;

public class Q16_Sequence6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int num = sc.nextInt();
        int res = 1;
        for (int i = 1; i <= num; i++) {
            if(i%3!=0){
                System.out.print(res + " ");
                res = res + (4*i);
            }
        }
    }
}
