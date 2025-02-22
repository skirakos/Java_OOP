import java.util.Scanner;

public class CDValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount invested in the CD: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the annual percentage yield: ");
        double annualPercentageYield = scanner.nextDouble();

        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();

        double monthlyYield = annualPercentageYield / 1200;
        System.out.printf("%-10s%-10s%n", "Month", "Value");
        System.out.println("---------------------");

        for (int month = 1; month <= months; month++) {
            amount += amount * monthlyYield;
            System.out.printf("%-10d%-10.2f%n", month, amount);
        }
    }
}