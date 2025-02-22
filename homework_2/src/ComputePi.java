public class ComputePi {
    public static void main(String[] args) {
        for (int n = 10000; n <= 100000; n += 10000) {
            double pi = 0.0;

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0)
                    pi -= 1.0 / (2 * i - 1);
                else
                    pi += 1.0 / (2 * i - 1);
            }

            pi *= 4;
            System.out.printf("Approximation of π for i = %d: %.6f%n", n, pi);
        }
    }
}
