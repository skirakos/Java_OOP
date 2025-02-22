import java.util.Scanner;

public class ProcessString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        StringBuilder oddCharacters = new StringBuilder();

        for (int i = 0; i < input.length(); i += 2) {
            oddCharacters.append(input.charAt(i));
        }

        System.out.println("Characters at odd positions: " + oddCharacters.toString());
        scanner.close();
    }
}
