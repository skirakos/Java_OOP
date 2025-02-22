import java.util.Scanner;

public class CheckISBN13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
        String input = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < 12; i++) {
            int digit = Character.getNumericValue(input.charAt(i)); // Attention
            if (i % 2 == 0) {
                sum += digit;
            } else {
                sum += digit * 3;
            }
        }

        int checksum = (10 - (sum % 10)) % 10;
        System.out.println("The complete ISBN-13 is: " + input + checksum);

        scanner.close();
    }
}