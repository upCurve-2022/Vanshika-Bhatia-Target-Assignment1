import java.util.Scanner;

public class Q4_EmptyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.nextLine();
        if(str.isEmpty()){
            System.out.println("String is Empty.");
        }
        else{
            System.out.println("String is not Empty.");
        }
    }
}
