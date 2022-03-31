import java.util.Scanner;

public class Q6_SeparateValue {
    static void separateDoubleInt(double number){
        int integerPart = (int)number;
        double doublePart = number-integerPart;
        System.out.println(integerPart);
        System.out.println(doublePart);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        double number = sc.nextDouble();
        separateDoubleInt(number);
    }
}
