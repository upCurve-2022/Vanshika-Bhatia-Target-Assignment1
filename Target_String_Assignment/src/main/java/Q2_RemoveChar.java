import java.util.Scanner;

public class Q2_RemoveChar {
    static String removeCharacter(String str, char c){
        String str1 = "";
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i)==c){
                str1 = str.replace(str.charAt(i), Character.MIN_VALUE);
            }
        }
        return str1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.nextLine();
        System.out.print("Enter character to be removed: ");
        char ch = sc.next().charAt(0);
        System.out.println(ch);
        System.out.printf("String before removing %c: %s\n",ch,str);
        System.out.printf("String after removing %c: %s\n",ch,removeCharacter(str,ch));

    }
}
