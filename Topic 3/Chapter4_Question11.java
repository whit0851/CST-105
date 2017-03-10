import java.util.*;
public class Chapter4_Question11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal value (0 to 15): ");
		int decimal = input.nextInt();
		input.close();
		char a;
		if(decimal <10)
			System.out.print("The hex value is " + decimal);
		
		else if(decimal <= 15 && decimal >= 10)
			System.out.print("The hex value is " + (char)(decimal-10 + 'A'));	
		else
			System.out.print(decimal + " is an invalid input");
	}	
	
}
