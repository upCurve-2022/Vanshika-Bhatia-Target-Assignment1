import java.util.Scanner;

public class Q3_StringDigitsOnly {
    static boolean isDigit(String str){
        int digit;
        for(int i = 0;i<str.length();i++){
            digit = (int)str.charAt(i);
            if(!(digit>=48&&digit<=57)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.nextLine();
        boolean allDigits = isDigit(str);
        if(allDigits){
            System.out.println("All the characters in this string are digits only");
        }
        else{
            System.out.println("All the characters in this string are not digits");
        }
    }
}
