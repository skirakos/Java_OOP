public class ConversionFromMilesToKilometers {
    public static void main(String[] args) {
        System.out.printf("%-12s %-12s%n", "Miles", "Kilometers");
        System.out.println("---------------------");

        for (int kilograms = 1; kilograms <= 10; kilograms++) {
            double pounds = kilograms * 1.609;
            System.out.printf("%-12d %-12.3f%n", kilograms, pounds);
        }
    }
}
