import java.time.LocalDate;
import java.time.LocalTime;

public class Q1_DateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Date is: " + date);
        LocalTime time = LocalTime.now();
        System.out.println("Time is: " + time);
    }
}
