import java.util.Scanner;

public class Q20_BinaryToDecimal {
    static String stringReverse(String s){
        String rev = "";
        for(int i=s.length()-1; i>=0;i--){
            rev += s.charAt(i);
        }
        return rev;
    }
    static int binToDec(int n) {
        String s = Integer.toString(n);
        String sRev = stringReverse(s);
        int len = 0;
        int res = 0;
        for (int i = 0; i < sRev.length(); i++) {
            if (sRev.charAt(i) == '1') {
                len = i;
                res += Math.pow(2, len);

            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int N = sc.nextInt();
        System.out.printf("Binary to Decimal of %d is: %d", N, binToDec(N));
    }
}
