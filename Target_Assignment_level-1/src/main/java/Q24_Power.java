import java.util.Scanner;

public class Q24_Power {
    static int power(int num, int power){
        int result = 1;
        for(int i=0; i<power; i++){
            result *= num;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        System.out.printf("%d to the power %d = %d",num,power,power(num,power));
    }
}
