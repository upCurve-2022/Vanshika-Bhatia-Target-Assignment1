import java.util.Scanner;

public class Q5_EvenOdd {
    //Function to check even/odd
    static void checkEvenOdd(int number){
        if(number%2==0){
            System.out.println("This number is Even.");
        }
        else{
            System.out.println("This number is Odd.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        checkEvenOdd(number);
    }
}
