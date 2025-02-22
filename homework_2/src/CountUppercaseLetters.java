import java.util.Scanner;

public class CountUppercaseLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int uppercaseCount = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            }
        }

        System.out.println("Number of uppercase letters: " + uppercaseCount);
    }
}
