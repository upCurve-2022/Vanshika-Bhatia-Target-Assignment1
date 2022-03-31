import java.util.Scanner;

public class Q6_CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first String: ");
        String str1 = sc.nextLine();
        System.out.println();
        System.out.print("Enter your second String: ");
        String str2 = sc.nextLine();
        int compare = str1.compareTo(str2);
        System.out.println("Method 1 using compareTo() method");
        if(compare<0){
            System.out.println("String1 is lexicographically less than String2");
        }
        else if(compare>0){
            System.out.println("String1 is lexicographically greater than String2");
        }
        else{
            System.out.println("String1 is equal to String2");
        }
        System.out.println("Method 2 using equals() method");
        if(str1.equals(str2)){
            System.out.println("String1 is equal to String2");
        }
        else{
            System.out.println("String1 is not equal to String2");
        }
        System.out.println("Method 3 using ==");
        if(str1==str2){
            System.out.println("String1 is equal to String2");
        }
        else{
            System.out.println("String1 is not equal to String2");
        }
        System.out.println("Method 4 using equalsIgnoreCase()");
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("String1 is equal to String2");
        }
        else{
            System.out.println("String1 is not equal to String2");
        }
        System.out.println("Method 5 using contentEquals()");
        if(str1.contentEquals(str2)){
            System.out.println("String1 is equal to String2");
        }
        else{
            System.out.println("String1 is not equal to String2");
        }

    }
}
