import java.util.Scanner;

public class Q15_StringPermutations {
    static void stringPermutations(String str){
        for (int i = 0;i<str.length();i++){
            for (int j = 0;j<str.length();j++){
                if(i!=j){
                    System.out.println();
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
    }

}
