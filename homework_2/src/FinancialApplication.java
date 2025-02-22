import static java.lang.Math.pow;

public class FinancialApplication {
    public static void main(String[] args) {
        int tuition = 10000;
        double percent = 5.0;
        double tuitionAfterTenYears = tuition * pow(1 + percent / 100, 10);
        double totalTuitionForFourYears = 0;
        for (int i = 1; i <= 4; i++) {
            totalTuitionForFourYears += tuitionAfterTenYears * pow(1 + percent / 100, i);
        }
        System.out.printf("Tuition after 10 years: %.2f\n", tuitionAfterTenYears);
        System.out.printf("Total tuition for the next 4 years: %.2f\n", totalTuitionForFourYears);
    }
}
