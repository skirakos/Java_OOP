import java.util.Scanner;

public class DisplayPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines: (from 1 to 15)");
        int rows = input.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < rows - i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            for (int j = 0; j < rows - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
