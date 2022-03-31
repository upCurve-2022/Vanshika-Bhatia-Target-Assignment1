import java.util.Scanner;

public class Q19_DecimalToBinary {
    static String stringReverse(String s){
        String rev = "";
        for(int i=s.length()-1; i>=0;i--){
            rev += s.charAt(i);
        }
        return rev;
    }
    static int decToBin(int n){
        String bin = "";
        int rem;
        while(n>=1){
            rem = n%2;
            bin += rem;
            n = n/2;
        }
        String binaryString = stringReverse(bin);
        int binary = Integer.parseInt(binaryString);
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int N = sc.nextInt();
        System.out.printf("Decimal to Binary of %d is: %d",N,decToBin(N));
    }
}
