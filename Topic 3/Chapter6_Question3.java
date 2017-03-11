import java.util.*;
public class Chapter6_Question3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a three-digit integer: \n");
		int number = input.nextInt();
		input.nextLine();
		input.close();
		System.out.print(number + " is a palindrome " +isPalindrome(number) );
		
		}

	public static boolean isPalindrome(int number){
		if(number == reverse(number))
				return true;
		else
			return false;
	}


	
	public static  int reverse(int number){
		int rnumber=0;
		int tnumber;
		while(number != 0){
			tnumber = number % 10;
			rnumber = rnumber * 10 + tnumber;
			number = number / 10;
		}
		return rnumber;
	}
}
