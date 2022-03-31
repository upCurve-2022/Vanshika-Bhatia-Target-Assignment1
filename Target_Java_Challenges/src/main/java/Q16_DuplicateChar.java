import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Q16_DuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        HashMap<Character, Integer> duplicate = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.toLowerCase().charAt(i);
            int value = 1;
            if (duplicate.containsKey(c)) {
                duplicate.put(c, duplicate.get(c) + 1);
            } else {
                duplicate.put(c, value);
            }
        }

        int count = 0;
        for (Entry<Character, Integer> entry : duplicate.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicated character is : " + entry.getKey() + " "+ entry.getValue() + " times.");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No character is repeated.");
        }
        System.out.println(duplicate);
    }
}

