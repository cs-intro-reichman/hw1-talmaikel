// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int fullnum = Integer.parseInt(args[0]);
		int ones = fullnum % 10;
		int tens = (fullnum-ones) % 100 /10;
		fullnum = fullnum/100;
		double hundreds = (double)fullnum % 10;

		System.out.println((int)hundreds +" hundreds, "+(int) tens+ " tens, and "+ (int) ones+ " ones.");

	}
}
