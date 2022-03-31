import java.util.Scanner;

public class Q14_Sequence4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N:");
        int N = sc.nextInt();
        int []arr = new int[N];
        arr[0]=1;
        arr[1]=4;
        arr[2]=7;
        for (int i=3; i<N; i++){
            arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
        }
        System.out.print("Sequence is: ");
        for (int i=0,len = arr.length; i<len; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
