import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat numberFormat = null;

        numberFormat = numberFormat.getCurrencyInstance(Locale.US);
        String us = numberFormat.format(payment);

        Locale locale = new Locale("en","IN");
        numberFormat = numberFormat.getCurrencyInstance(locale);
        String india = numberFormat.format(payment);

        numberFormat =  numberFormat.getCurrencyInstance(Locale.CHINA);
        String china = numberFormat.format(payment);

        numberFormat = numberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = numberFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}