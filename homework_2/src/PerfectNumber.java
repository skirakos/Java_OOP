public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Perfect numbers up to 10,000:");

        for (int number = 1; number <= 10000; number++) {
            int sumOfDivisors = 0;

            for (int divisor = 1; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    sumOfDivisors += divisor;
                }
            }
            if (sumOfDivisors == number) {
                System.out.println(number);
            }
        }
    }
}