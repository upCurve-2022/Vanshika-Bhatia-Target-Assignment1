import java.util.Scanner;

public class Q7_RemoveHyphen {
    static boolean isDigit(char c){
        if(!(c >= '0'&& c<='9')){
            return false;
        }
        return true;
    }
    static void removeHyphen(String str){
        String str1 = "";
        for (int i=1; i<str.length()-1; i++){
            if(str.charAt(i)=='-'&&isDigit(str.charAt(i-1))&&isDigit(str.charAt(i+1))){
                str = str.replace(str.charAt(i), Character.MIN_VALUE);
            }
        }
        System.out.println("String after removing hyphen: " + str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.nextLine();
        removeHyphen(str);
    }
}
