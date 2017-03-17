import java.util.*;
public class Chapter5_Question21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double Loan = input.nextDouble();
		System.out.print("Nubmer of Years: ");
		int years = input.nextInt();
		input.nextLine();
		input.close();
		double i = 5;
		System.out.printf("%13s     %15s     %10s\n", "Interest Rate", "Monthly Payment", "Total Payment");
		while (i <=8){
			double monthlyPayment = (Loan *(i/1200))/(1-(1/(Math.pow(1+(i/1200), years*12))));
			double totalPayment = monthlyPayment*years*12;
			System.out.printf("%.3f%%            %.2f              %.2f\n",i, monthlyPayment, totalPayment);
		i+=.125;
		}
	}

}
