public class ComputeE {
    public static void main(String[] args) {
        double e = 1.0;
        double item = 1.0;

        for (int i = 1; i <= 20; i++) {
            item /= i;
            e += item;
            System.out.printf("e after %d terms: %.16f%n", i, e);
        }
    }
}
