import java.util.Scanner;

public class Q6_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if (year % 400 == 0) {
            if (year % 100 == 0) {
                if (year % 4 == 0) {
                    System.out.println("This is a Leap year");
                }
            }
        }
        else {
            System.out.println("This is not a Leap year");
        }

    }
}
