import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        double balance;
        int rate = 0;
        BigDecimal total;

        System.out.println("Please enter your balance ->");
        Scanner inputNumScanner = new Scanner(System.in);
        balance = (inputNumScanner.nextDouble());

        if (balance < 1) {
            rate = 0;
        } else if (balance >= 1 & balance <= 100) {
            rate = 3;
        } else if (balance >= 100.01 & balance <= 1000) {
            rate = 5;
        } else if (balance >= 1000.01) {
            rate = 7;
        }

        total = BigDecimal.valueOf((balance / 100 * rate + balance)).setScale(2, RoundingMode.DOWN);

        System.out.println("Interest rate is: " + rate);
        System.out.println("Your balance is: " + total);
        if (balance < 1) {
            System.out.println("Your balance should be more than $1 to obtain interest rate");
        }
    }
}
