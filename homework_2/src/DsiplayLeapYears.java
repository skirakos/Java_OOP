public class DsiplayLeapYears {
    public static void main(String[] args) {
        int leapYearCount = 0;
        int countPerLine = 0;

        System.out.println("Leap Years from 101 to 2100:");

        for (int year = 101; year <= 2100; year++) {
            if (isLeapYear(year)) {
                System.out.print(year + " ");
                leapYearCount++;
                countPerLine++;

                if (countPerLine == 10) {
                    System.out.println();
                    countPerLine = 0;
                }
            }
        }

        System.out.println("\nTotal number of leap years: " + leapYearCount);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}