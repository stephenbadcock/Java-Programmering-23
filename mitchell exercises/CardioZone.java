import java.util.Scanner;

public class CardioZone {
	public static void main( String[] args ) {
		int age, maxHeartRate;
		double zoneMin, zoneMax;

		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Age: " );
		age = keyboard.nextInt();

		maxHeartRate = 220 - age;
		System.out.println( "The maximum heart rate for a " + age + "-year-old is " + maxHeartRate );

		zoneMin = Math.round(maxHeartRate * 0.60);
		zoneMax = Math.round(maxHeartRate * 0.80);

		System.out.println( "The \"cardio zone\" is from " + zoneMin + " to " + zoneMax + " bpm." );
		
	}
}
