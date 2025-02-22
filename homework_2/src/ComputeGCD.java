import java.util.Scanner;

public class ComputeGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first positive integer: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the second positive integer: ");
        int n2 = scanner.nextInt();

        int gcd = Math.min(n1, n2);

        while (gcd >= 1) {
            if (n1 % gcd == 0 && n2 % gcd == 0) {
                break;
            }
            gcd--;
        }

        System.out.println("The greatest common divisor of " + n1 + " and " + n2 + " is: " + gcd);
        scanner.close();
    }
}