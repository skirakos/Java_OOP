public class DemonstrateCancellationErrors {
    public static void main(String[] args) {
        int n = 50000;
        double sumLeftToRight = 0.0;
        double sumRightToLeft = 0.0;

        for (int i = 1; i <= n; i++) {
            sumLeftToRight += 1.0 / i;
        }

        for (int i = n; i >= 1; i--) {
            sumRightToLeft += 1.0 / i;
        }

        System.out.printf("Summation from left to right: %.15f%n", sumLeftToRight);
        System.out.printf("Summation from right to left: %.15f%n", sumRightToLeft);
        System.out.printf("Difference between two summations: %.15f%n", Math.abs(sumLeftToRight - sumRightToLeft));
    }
}
