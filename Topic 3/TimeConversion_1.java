import java.util.*;
public class TimeConversion_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an hour in 24 hr format: ");
		int time = input.nextInt();
		input.nextLine();
		input.close();
		if (time==0)
			System.out.print("The time is " + (time + 12) + " am");
		else if(time >= 1 && time<=11)
			System.out.print("The time is " + (time) + " am");
		else if(time == 24 )
			System.out.print("The time is " + (time-12) + " am");
		else if(time == 12 )
			System.out.print("The time is " + (time) + " pm");
		else if (time >= 13 && time<=23)
			System.out.print("The time is " + (time-12) + " pm");
		else
			System.out.print("Invalid Time");
	}

}
