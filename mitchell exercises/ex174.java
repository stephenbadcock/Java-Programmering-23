public class ex174 {
	public static void main( String[] args ) {
		System.out.println("Watch as we demonstrate functions.");

		System.out.println();
		System.out.println("I'm going to get a random character from A-Z");
		char c = randchar();
		System.out.println("The character is: " + c );

		System.out.println();
		System.out.println("Now let's count from -40 to 10");
		int begin, end;
		begin = -40;
		end = 10;
		counter(begin, end);
		System.out.println("How was that?");

		System.out.println();
		System.out.println("Now we take the absolute value of a number.");
		int x, y = 99;
		x = -20;
		y = abso(x);
		System.out.println("|" + x + "| = " + y );

		System.out.println();
		System.out.println("That's all.  This program has been brought to you by:");
		credits();
	}

	public static void credits() {
		System.out.println();
		System.out.println("programmed by Graham Mitchell");
		System.out.println("modified by Stephen");
		System.out.print("This code is distributed under the terms of the standard ");
		System.out.println("BSD license.  Do with it as you wish.");
	}

	public static char randchar() {
		// chooses a random character in the range "A" to "Z"
		int numval;
		char charval;

		// pick a random number from 0 to 25
		numval = (int)(Math.random()*26);
		// now add that offset to the value of the letter 'A'
		charval = (char) ('A' + numval);

		return charval;
	}

	public static void counter(int start, int stop) {
		// counts from start to stop by ones
		int ctr;

		ctr = start;
		while ( ctr <= stop ) {
			System.out.print(ctr + " ");
			ctr = ctr+1;
		}
	}

	public static int abso(int value) {
		// finds the absolute value of the parameter
		int absval;

		if ( value < 0 )
			absval = -value;
		else
			absval = value;

		return absval;
	}
}
