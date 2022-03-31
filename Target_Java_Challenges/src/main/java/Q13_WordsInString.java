import java.util.Scanner;

public class Q13_WordsInString {
    static int totalWords(String st) {
        int words = 0;
        if (!st.equals("")) {
            for (int i = 0; i < st.length(); i++) {
                if (st.charAt(i) != ' ') {
                    words++;
                }
            }
        } else {
            System.out.println("String is empty!");
        }
        return words;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Total words in the string are: " + totalWords(str));
    }
}
