import java.util.Scanner;

public class Q3_Simple_Interest {
    //Function to calculate simple interest
    static float simpleInterest(float principal, float rate, float time) {
        float si = (principal * rate * time) / 100;
        return si;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        float principal = sc.nextFloat();
        System.out.println("Enter rate of interest: ");
        float rate = sc.nextFloat();
        System.out.println("Enter time: ");
        float time = sc.nextFloat();
        float simpleInt = simpleInterest(principal, rate, time);
        System.out.println("Simple interest is: " + simpleInt);
    }
}
