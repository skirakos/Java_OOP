import java.util.Random;

public class Simulation {
    public static void main(String[] args) {
        Random random = new Random();
        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 0; i < 1000000; i++) {
            if (random.nextBoolean()) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }
        System.out.println("Number of heads: " + headsCount);
        System.out.println("Number of tails: " + tailsCount);
    }
}
