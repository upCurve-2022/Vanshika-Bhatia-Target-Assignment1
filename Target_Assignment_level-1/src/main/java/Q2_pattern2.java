public class Q2_pattern2 {
    //Function to print pattern
    static void print_pattern(int n) {
        //Loop for rows
        for (int i = 0; i < n; i++) {
            //Loop for printing spaces
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            //Loop for columns
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print_pattern(5);
    }
}
