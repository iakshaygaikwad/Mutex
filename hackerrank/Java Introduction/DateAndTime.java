//Java Date and Time 
//https://www.hackerrank.com/challenges/java-date-and-time

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class DateAndTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(year),(Integer.parseInt(month)-1),Integer.parseInt(day));
        String s = calendar.getDisplayName(calendar.DAY_OF_WEEK,calendar.LONG, Locale.ENGLISH);
        System.out.println(s.toUpperCase());
    }
}