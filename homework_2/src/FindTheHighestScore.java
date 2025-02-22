import java.util.Scanner;

public class FindTheHighestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = Integer.parseInt(scanner.nextLine());

        String topStudent = "";
        int highestScore = Integer.MIN_VALUE; //Attention
        for (int i = 1; i <= number; i++) {
            System.out.print("Enter the name of student " + i + ": ");
            String name = scanner.next();

            System.out.print("Enter the score of " + name + ": ");
            int score = Integer.parseInt(scanner.next());

            if (score > highestScore) {
                highestScore = score;
                topStudent = name;
            }
        }
        scanner.close();
        System.out.println("The student with the highest score is: " + topStudent);
    }
}
//next() stops reading at the first whitespace and returns the token before it.
//nextLine() reads everything until the newline character and returns the whole line.