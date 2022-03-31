import java.util.Scanner;

public class Q3_PenDiscount {
    static void penDiscount(int cost, int discount){
        float penDisc = cost*((float)discount/100);
        float sellingPrice = cost-penDisc;
        System.out.println("Discount amount of pen is: "+penDisc+"$");
        System.out.println("Selling Price of pen is: "+sellingPrice+"$");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost and discount of pen: ");
        int cost = sc.nextInt();
        int discount = sc.nextInt();
        penDiscount(cost,discount);
    }
}
