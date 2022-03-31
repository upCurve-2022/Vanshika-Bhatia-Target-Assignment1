import java.util.Scanner;

public class Q18_Largest3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        int largestNum = three>(one>two?one:two)?three:(one>two?one:two);
        System.out.println("Largest number is: "+largestNum);
    }
}
