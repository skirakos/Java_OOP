import java.util.Scanner;

public class FindTheTwoHighestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = Integer.parseInt(scanner.nextLine());

        String topStudent = "";
        String secondTopStudent = "";
        int highestScore = Integer.MIN_VALUE; //Attention
        int secondHighestScore = Integer.MIN_VALUE;
        for (int i = 1; i <= number; i++) {
            System.out.print("Enter the name of student " + i + ": ");
            String name = scanner.next();

            System.out.print("Enter the score of " + name + ": ");
            int score = Integer.parseInt(scanner.next());

            if (score > highestScore) {
                secondHighestScore = highestScore;
                secondTopStudent = topStudent;
                highestScore = score;
                topStudent = name;
            } else if (score > secondHighestScore) {
                secondHighestScore = score;
                secondTopStudent = name;
            }
        }
        scanner.close();
        System.out.println("The student with the highest score is: " + topStudent + " with a score of " + highestScore);
        System.out.println("The student with the second-highest score is: " + secondTopStudent + " with a score of " + secondHighestScore);
    }
}
