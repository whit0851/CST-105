import java.util.*;
public class Chapter18_Question9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String string = input.nextLine();
		input.close();
		reverseDisplay(string);
		
	}	
		
	public static void reverseDisplay(String value){
		char[] ch1 = value.toCharArray();
		for (int i = ch1.length-1; i>=0; i--)
			System.out.print(ch1[i]);
	}

	

}
