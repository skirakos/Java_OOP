import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (e.g., 5 for 5%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        double totalAmount = 0;

        for (int month = 1; month <= months; month++) {
            totalAmount = (totalAmount + monthlySaving) * (1 + monthlyInterestRate);
        }

        System.out.printf("The total amount in the savings account after %d months is: %.2f\n", months, totalAmount);
    }
}