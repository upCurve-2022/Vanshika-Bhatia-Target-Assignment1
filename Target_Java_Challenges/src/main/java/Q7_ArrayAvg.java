import java.util.Scanner;

public class Q7_ArrayAvg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for (int i=0; i<n;i++){
            sum += arr[i];
        }
        int avg = sum/arr.length;
        System.out.println("Average of elements of array is: "+avg);
    }
}
