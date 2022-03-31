import java.util.Scanner;

public class Q15_Sequence5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int num = sc.nextInt();
        int res = 1;
        for (int i = 1; i <= num; i++) {
            if(i%4!=0){
                res = i*i;
                System.out.print(res + " ");
            }
        }

    }
}

