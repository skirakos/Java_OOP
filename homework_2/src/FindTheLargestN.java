public class FindTheLargestN {
    public static void main(String[] args) {
        int n = 1;

        while (n * n * n < 12000) {
            n++;
        }
        n--;
        System.out.println("The largest n such that n^3 < 12000 is: " + n);
    }
}
