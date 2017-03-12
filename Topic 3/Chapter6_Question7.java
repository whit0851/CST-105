import java.util.*;
public class Chapter6_Question7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("The amount invested: ");
		double invested = input.nextDouble();
		System.out.print("Annual interest rate: ");
		double interestrate = input.nextDouble();
		input.close();
		double mrate = (interestrate/(100*12));
		System.out.print("Years     "+"Future Value\n");
		
		for (int i=1; i <= 30; i++){
			invested = futureInvestmentValue(invested, mrate, 1);
			System.out.printf(i + "     " + invested + "\n" );
			
		}
	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
		
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years*12);
	}
	
}
