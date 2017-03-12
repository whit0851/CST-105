import java.util.*;

public class TimeConversion_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a time in decimal format: ");
		double time = input.nextDouble();
		double newtime = time*60;
		double mins = newtime % 60;
		double hours = (newtime - mins)/60;
		input.close();
		System.out.printf("User entered time of " + time + " is %.0f hours and %.0f mins", hours, mins );
	}

}
