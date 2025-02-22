import java.util.Scanner;

public class OccurrenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int count = 0;
        boolean hasNumbers = false;

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }

            hasNumbers = true;

            if (number > max) {
                max = number;
                count = 1;
            } else if (number == max) {
                count++;
            }
        }

        if (hasNumbers) {
            System.out.println("The largest number is " + max + " and it occurs " + count + " times.");
        } else {
            System.out.println("No numbers are entered except 0.");
        }
    }
}
