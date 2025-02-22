import java.util.Scanner;
import java.util.Random;

public class RepeatAdditions {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        final int NUMBER_OF_QUESTIONS = 10;
        int correct = 0;
        long startTime = System.currentTimeMillis(); // Start timing the quiz

        System.out.println("Welcome to the Addition Quiz!");
        System.out.println("You will be asked " + NUMBER_OF_QUESTIONS + " addition questions.");
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int n1 = random.nextInt(15) + 1; //random number from 1 to 15
            int n2 = random.nextInt(15) + 1;
            System.out.println("Question " + (i + 1) + ": "  + n1 + " + " + n2 + " = ? ");
            int answer = scanner.nextInt();
            if (answer == n1 + n2) {
                System.out.println("Correct!");
                correct++;
            } else {
                System.out.println("Incorrect. The correct answer is " + (n1 + n2) + ".");
            }
        }
        long endTime = System.currentTimeMillis(); // End timing the quiz
        long testTime = endTime - startTime; // time taken in milliseconds

        System.out.println("\nQuiz completed!");
        System.out.println("You answered " + correct + " out of " + NUMBER_OF_QUESTIONS + " questions correctly.");
        System.out.println("Time taken: " + (testTime / 1000.0) + " seconds."); // Displaying time in seconds

        scanner.close();
    }
}
