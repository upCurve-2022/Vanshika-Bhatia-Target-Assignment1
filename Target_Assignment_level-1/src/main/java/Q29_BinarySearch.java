import java.util.Arrays;
import java.util.Scanner;

public class Q29_BinarySearch {
    public static int binarySearch(int []array, int x, int left, int right){
        while (left<=right) {
            int mid = (left + right) / 2;
            if (array[mid] == x) {
                return mid;
            }
            else if (array[mid] > x) {
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int N = sc.nextInt();
        int []arr = new int[N];
        System.out.print("\nEnter the elements: ");
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be found: ");
        int element = sc.nextInt();
        Arrays.sort(arr);
        int len = arr.length;
        int bs = binarySearch(arr, element, 0, len-1);
        if(bs==0){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at position: " + (bs+1));
        }
    }
}
