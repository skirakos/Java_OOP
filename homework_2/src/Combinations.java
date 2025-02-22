public class Combinations {
    public static void main(String[] args) {
        int totalCombinations = 0;

        for (int i = 1; i <= 7; i++) {
            for (int j = i + 1; j <= 7; j++) {
                System.out.println(i + " " + j);
                totalCombinations++;
            }
        }

        System.out.println("Total combinations: " + totalCombinations);
    }
}
