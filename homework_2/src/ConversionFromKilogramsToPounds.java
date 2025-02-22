public class ConversionFromKilogramsToPounds {
    public static void main(String[] args) {
        System.out.printf("%-12s %-12s%n", "Kilograms", "Pounds");
        System.out.println("---------------------");

        for (int kilograms = 1; kilograms <= 199; kilograms++) {
            double pounds = kilograms * 2.2;
            System.out.printf("%-12d %-12.1f%n", kilograms, pounds);
        }
    }
}

//%-12d: This format specifier indicates that the integer value (like the kilograms) should also be left-aligned in a field of 12 characters wide.