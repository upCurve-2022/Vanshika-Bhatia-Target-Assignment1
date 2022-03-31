import java.util.Scanner;

public class Q10_NumToWords {
static void convertWords(String num){
    String []numWords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
    for (int i = 0; i<num.length(); i++) {
        if(num.charAt(i) == '0'){
            System.out.println();
        }
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        String number = Integer.toString(num);
    }
}
