public class SumASeries {
    public static void main(String[] args) {
        double sum = 0.0;

        for (int i = 1; i <= 97; i += 2) {
            sum += (double) i / (i + 2);
        }

        System.out.printf("Summation result: %.6f%n", sum);
    }
}
