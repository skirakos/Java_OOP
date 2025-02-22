import java.util.Scanner;

public class FindTheFactorsOfAnInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int originalNumber = number;

        System.out.print("Factors of " + originalNumber + " are: ");

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
        scanner.close();
    }
}
