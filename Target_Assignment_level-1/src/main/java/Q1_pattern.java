public class Q1_pattern {
    //Function to print pattern
    static void print_pattern(int n) {
        int m = 1;
        //Loop for rows
        for (int i = 0; i < n; i++) {
            //Loop for columns
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }
            m++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print_pattern(5);
    }
}
