public class ConversionFromKilogramsToPoundsAndPoundsToKilograms {
    public static void main(String[] args) {
        System.out.printf("%-12s %-12s | %-12s %-12s%n", "Kilograms", "Pounds", "Pounds", "Kilograms");
        System.out.println("--------------------------------------------------");

        for (int kg = 1, lb = 20; kg <= 199 && lb <= 515; kg += 2, lb += 5) {
            double pounds = kg * 2.2;
            double kilogramsFromPounds = lb / 2.2;

            System.out.printf("%-12d %-12.1f | %-12d %-12.2f%n", kg, pounds, lb, kilogramsFromPounds);
        }
    }
}
//for loops with 2 variables are also possible
