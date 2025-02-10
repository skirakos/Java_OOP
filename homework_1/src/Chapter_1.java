public class Chapter_1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");


        System.out.println("    J    A   V     V  A");
        System.out.println("    J   A A   V   V  A A");
        System.out.println("J   J  AAAAA   V V  AAAAA");
        System.out.println(" J J  A     A   V  A     A");

        int n = 4;
        System.out.println("\na  a^2  a^3");
        for (int a = 1; a <= n; a++) {
            System.out.printf("%d   %d   %d\n", a, a * a, a * a * a);
        }


        for (int i = 0; i < 5; i++) {
            System.out.println("Welcome to Java");
        }


        System.out.println("\nResult of the expression: " + (9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));

        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            sum += i;
        }
        System.out.println("Summation of series: " + sum);
        System.out.println();


        double expressionResult1 = 4.0 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11);
        double expressionResult2 = 4.0 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);
        System.out.println("\nResult of the first expression: " + expressionResult1);
        System.out.println("Result of the second expression: " + expressionResult2);

        double radius = 5.5;
        double circlePerimeter = 2 * radius * Math.PI;
        double circleArea = radius * radius * Math.PI;
        System.out.println("\nCircle Perimeter: " + circlePerimeter);
        System.out.println("Circle Area: " + circleArea);

        double width = 4.5, height = 7.9;
        double rectangleArea = width * height;
        System.out.println("\nRectangle Area: " + rectangleArea);

        double kilometers = 14;
        double miles = kilometers / 1.6;
        double totalTimeHours = (45.0 / 60) + (30.0 / 3600);
        double speed = miles / totalTimeHours;
        System.out.println("\nAverage Speed in miles per hour: " + speed);


        // Population Projection
        int currentPopulation = 312032486;
        int secondsInYear = 365 * 24 * 60 * 60;
        int birthsPerYear = secondsInYear / 7;
        int deathsPerYear = secondsInYear / 13;
        int immigrantsPerYear = secondsInYear / 45;

        for (int year = 1; year <= 5; year++) {
            currentPopulation += birthsPerYear + immigrantsPerYear - deathsPerYear;
            System.out.println("Population after year " + year + ": " + currentPopulation);
        }

        // Average speed in kilometers per hour
        double milesRun = 24;
        double kilometersRun = milesRun * 1.6;
        double totalTimeInHours = (1.0) + (40.0 / 60) + (35.0 / 3600);
        double avgSpeedKm = kilometersRun / totalTimeInHours;
        System.out.println("\nAverage Speed in kilometers per hour: " + avgSpeedKm);

        // Solving linear equations using Cramer's Rule
        double a = 3.4, b = 50.2, e = 44.5;
        double c = 2.1, d = 0.55, f = 5.9;
        double denominator = (a * d - b * c);
        double x = (e * d - b * f) / denominator;
        double y = (a * f - e * c) / denominator;

        System.out.println("\nSolution of equations:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}