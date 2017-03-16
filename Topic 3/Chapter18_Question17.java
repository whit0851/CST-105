import java.util.*;
public class Chapter18_Question17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an array of characters and character to seach for: ");
		String Str1 = input.nextLine();
		char ch2 = input.next().charAt(0);
		input.close();
		char [] ch1 = Str1.toCharArray();
		int high =0;
		System.out.print("There are " + count(ch1, ch2, high) +" " +ch2+ "'s in " + Str1 );
		
		}
		public static int count(char[] chars, char a, int high){
		for (int i = 0; i<chars.length; i++)
			if (chars[i]==a)
				high ++;
		return high;
			
			
		
	}

}
