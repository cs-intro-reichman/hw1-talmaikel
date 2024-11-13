// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		double num1 = Math.random()*lim;
		double num2 = Math.random()*lim;
		double num3 = Math.random()*lim;
		int NUM1 = (int) num1;
		int NUM2 = (int) num2;
		int NUM3 = (int) num3;


		System.out.println("the number are: "+ (int) num1+" , "+(int) num2+" , "+(int) num3+" . ");

		int min = Math.min(Math.min(NUM1, NUM2), NUM3);
		int max = Math.max(Math.max(NUM1, NUM2), NUM3);
		int mid = NUM1+NUM2+NUM3-min-max;

		System.out.println("the number are: "+ min+" , "+mid+" , "+max+" . ");

	}
}
