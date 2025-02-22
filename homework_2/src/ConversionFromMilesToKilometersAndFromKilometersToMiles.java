public class ConversionFromMilesToKilometersAndFromKilometersToMiles {
    public static void main(String[] args) {
        System.out.printf("%-12s %-12s | %-12s %-12s%n", "Miles", "Kilometers", "Kilometers", "Miles");
        System.out.println("-----------------------------------------------");

        for (int miles = 1, kilometers = 20; miles <= 10 && kilometers <= 65; miles++, kilometers += 5) {
            double kilometersFromMiles = miles * 1.609;
            double milesFromKilometers = kilometers / 1.609;

            System.out.printf("%-12d %-12.3f | %-12d %-12.3f%n", miles, kilometersFromMiles, kilometers, milesFromKilometers);
        }
    }
}
