import java.util.Date;
import java.util.Arrays;

public class ArrayOfDates {
    public static void main(String[] args) {
        Date[] randomDates = {new Date(566985221162L), new Date(3266985221162L), new Date(7996775221162L), new Date(4665221162L)};

        Arrays.sort(randomDates);

        System.out.println("Earliest date: " + randomDates[0]);
        System.out.println("Latest date: " + randomDates[3]);

        long dateDifference = randomDates[3].getTime() - randomDates[0].getTime();
        long dateDifferenceYears = dateDifference / 1000 / 60 / 60 / 24 / 365;

        System.out.println("Difference in years: " + dateDifferenceYears);
    }
}
