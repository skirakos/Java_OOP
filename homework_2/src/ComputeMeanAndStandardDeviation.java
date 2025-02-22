import java.util.Scanner;

public class ComputeMeanAndStandardDeviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        double sum = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double mean = sum / 10;
        double sumOfSquares = 0;

        for (int i = 0; i < 10; i++) {
            sumOfSquares += Math.pow(numbers[i] - mean, 2);
        }

        double standardDeviation = Math.sqrt(sumOfSquares / (10 - 1));

        System.out.printf("Mean: %.2f\n", mean);
        System.out.printf("Standard Deviation: %.5f\n", standardDeviation);
    }
}
