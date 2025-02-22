import java.util.Scanner;

public class PositiveNegativeNumbers {
    public static void main(String[] args) {
        int positive_count = 0;
        int negative_count = 0;
        int total = 0;
        double average;
        System.out.println("Enter an integer, the input ends if it is 0: ");
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            int number = scanner.nextInt(); // Attention, not reading line by line

            if (number == 0)
                break;
            total += number;
            if (number > 0)
                positive_count++;
            else {
                negative_count++;
            }
        }
        scanner.close();
        if (positive_count + negative_count != 0) {
            System.out.println("The number of positives is " + positive_count);
            System.out.println("The number of negatives is " + negative_count);
            System.out.println("The total is " + total);
            int count = positive_count + negative_count;
            average = (double) total / count; // Attention, ete double chgrei, sxal er tpelu
            System.out.println("The average is " + average);
        }else
            System.out.println("No numbers are entered except 0");

    }
}
//1 2 –1 3 0

// In Java, if both operands of the division operator / are integers, Java performs integer division. This means it will divide the numbers and truncate (discard) any decimal part.