import java.util.Scanner;
import java.time.LocalTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Chapter_2 {
    public static void main(String[] args) {
        //2.1
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double number = input.nextDouble();
        System.out.print(number + " Celsius is " + ((9.0 / 5) * number + 32) + " Fahrenheit.");

        //2.2
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = in.nextDouble();
        double length = in.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.print("The area is ");
        System.out.printf("%.1f", area);
        System.out.println();
        System.out.print("The volume is ");
        System.out.printf("%.1f", (area * length));

        //2.3
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        double meters = feet * 0.305;
        System.out.println(feet + " feet is " + meters + " meters");

        //2.4
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds = scanner.nextDouble();
        double kilograms = pounds * 0.454;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");

        //2.5
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = scanner.nextDouble();
        double gratuityRate = scanner.nextDouble();
        double gratuity = subtotal * gratuityRate / 100;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

        //2.6
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int num = number.nextInt();
        if (num > 0 && num <= 10) {
            System.out.println("The sum of the digits is " + num);
        } else if (num >= 10 && num < 1000) {
            int hundred = num / 100;
            num = num % 100;
            int ten = num / 10;
            int digit = num % 10;
            System.out.println("The sum of the digits is " + (hundred + ten + digit));
        } else {
            System.out.println("Error: Enter a number between 0 and 1000.");
        }

        //2.7
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days % 365 + " days.");

        //2.8
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();
        LocalTime currentTime = LocalTime.now();

        LocalTime adjustedTime = currentTime.minusHours(offset);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = adjustedTime.format(formatter);
        System.out.println("The current time is " + formattedTime);

        //2.9
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t: ");
        double v0 = scanner.nextDouble();
        double v1 = scanner.nextDouble();
        double t = scanner.nextDouble();

        double averageAcceleration = (v1 - v0) / t;

        System.out.print("The average acceleration is ");
        System.out.printf("%.4f", averageAcceleration);

        //2.10
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double mass = scanner.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double initialTemperature = scanner.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemperature = scanner.nextDouble();

        double energy = mass * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy needed is " + energy);

        //2.11


        //2.12
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        double v = scanner.nextDouble();
        double a = scanner.nextDouble();

        double runwayLength = (v * v) / (2 * a);

        System.out.printf("The minimum runway length for this airplane is %.3f\n", runwayLength);

        //2.13
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = scanner.nextDouble();
        double annualInterestRate = 0.05;
        double monthlyInterestRate = annualInterestRate / 12;
        double valueAfterFirstMonth = monthlySaving * (1 + monthlyInterestRate);
        double valueAfterSecondMonth = (monthlySaving + valueAfterFirstMonth) * (1 + monthlyInterestRate);
        double valueAfterThirdMonth = (monthlySaving + valueAfterSecondMonth) * (1 + monthlyInterestRate);
        double valueAfterFourthMonth = (monthlySaving + valueAfterThirdMonth) * (1 + monthlyInterestRate);
        double valueAfterFifthMonth = (monthlySaving + valueAfterFourthMonth) * (1 + monthlyInterestRate);
        double valueAfterSixthMonth = (monthlySaving + valueAfterFifthMonth) * (1 + monthlyInterestRate);

        System.out.printf("After the sixth month, the account value is $%.2f\n", valueAfterSixthMonth);

        //2.14
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        double heightInInches = scanner.nextDouble();
        double weightInKilograms = weightInPounds * 0.45359237;
        double heightInMeters = heightInInches * 0.0254;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.printf("BMI is %.4f\n", bmi);

        //2.15
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        System.out.println("The distance between the two points is " + distance);

        //2.16
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the side: ");
        double sideLength = scanner.nextDouble();
        double area = (3 * Math.sqrt(3) / 2) * Math.pow(sideLength, 2);

        System.out.printf("The area of the hexagon is %.4f\n", area);

        //2.17
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double windSpeed = scanner.nextDouble();

        if ((temperature < -58 || temperature > 41) || windSpeed < 2) {
            System.out.println("The formula cannot be used for the given values.");
        } else {
            double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
            System.out.printf("The wind chill index is %.5f\n", windChill);
        }

        //2.18
        System.out.println("a\tb\tpow(a, b)");

        for (int a = 1; a <= 5; a++) {
            int b = a + 1;
            int result = (int) Math.pow(a, b);
            System.out.println(a + "\t" + b + "\t" + result);
        }

        //2.19
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.printf("The area of the triangle is %.1f\n", area);

        //2.20
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = scanner.nextDouble();
        double annualInterestRate = scanner.nextDouble();
        double interest = balance * (annualInterestRate / 1200);

        System.out.printf("The interest is %.5f\n", interest);

        //2.21
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investmentAmount = scanner.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter number of years: ");
        int numberOfYears = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200;
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), numberOfYears * 12);

        System.out.printf("Future value is $%.2f\n", futureInvestmentValue);

        //2.23
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = scanner.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = scanner.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = scanner.nextDouble();
        double costOfTrip = (distance / milesPerGallon) * pricePerGallon;

        System.out.printf("The cost of driving is $%.2f\n", costOfTrip);

    }
}
