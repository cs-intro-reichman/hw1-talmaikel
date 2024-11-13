// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		String currentValue = args[0];
		String rate = args[1];
		String n = args[2];
		int nInt = Integer.parseInt(n);
		double rateDouble = Double.parseDouble(rate);
		double currentValueDouble = Double.parseDouble(currentValue);

		double futureValue = currentValueDouble * Math.pow((1.0+rateDouble/100), nInt) ;

		System.out.println("after "+ n +" yeras, $"+currentValue+" saved at "+rateDouble+"% will yield $"+(int) futureValue);

	}
}