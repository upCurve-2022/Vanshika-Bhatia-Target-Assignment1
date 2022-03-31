import java.util.Scanner;

public class Q28_LinearSearch {
    static int linearSearch(int[] array, int x){
        for(int i=0,length = array.length;i<length;i++){
            if(x==array[i]){
                System.out.printf("Element %d found at %d position.",x,i+1);
                return 0;
            }
        }
        System.out.printf("Element was not present in the array");
        return -1;
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
        linearSearch(arr,element);

    }
}
