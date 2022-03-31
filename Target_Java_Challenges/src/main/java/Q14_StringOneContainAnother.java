import java.util.Scanner;

public class Q14_StringOneContainAnother {
    static void checkString(String st1, String st2){
        if(st1.contains(st2)){
            System.out.println("String 1 contains string 2");
        }
        else{
            System.out.println("String 1 doesn't contains string 2");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String string1 = sc.nextLine();
        System.out.println("Enter second String: ");
        String string2 = sc.nextLine();
        checkString(string1, string2);
    }
}
