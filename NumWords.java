// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int fullnum = Integer.parseInt(args[0]);
		double ones = (double)fullnum % 10;
		fullnum = fullnum/10;
		double tens = (double)fullnum % 10;
		fullnum = fullnum/10;
		double hundreds = (double)fullnum % 10;

		System.out.println((int)hundreds +" hundreds, "+(int) tens+ " tens, "+ (int) ones+ " ones.");

	}
}
