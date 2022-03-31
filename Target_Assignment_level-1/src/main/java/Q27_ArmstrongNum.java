import java.util.Scanner;

public class Q27_ArmstrongNum {
    static void isArmstrong(int num){
        int n = num;
        int result = 0;
        while (n%10!=0){
            result += Math.pow(n%10,3);
            n = n/10;
        }
//        result += Math.pow(n,3);
        System.out.println(result);
        if(result==num){
            System.out.println("This is an armstrong number");
        }
        else{
            System.out.println("This is not an armstrong number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a 3-digit number: ");
            num = sc.nextInt();
        }while(num>999 || num<100);
        isArmstrong(num);
    }
}
