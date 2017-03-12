import java.util.*;
public class Chapter18_Question10 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter a string and character: ");
	String Str1 = input.nextLine();
	char ch1 = input.next().charAt(0);
	input.close();
	System.out.print("There are " + count(Str1, ch1) +" " +ch1+ "'s in " + Str1 );
	
	}
	public static int count(String str, char a){
	String str2=str.toLowerCase();
	String str3=str.toUpperCase();
	int count  = 0 ;
	char [] cha = str2.toCharArray();
	char [] chb = str3.toCharArray();
	for (int i = 0; i<cha.length; i++)
		if (cha[i]==a)
			count++;
	for (int i = 0; i<chb.length; i++)
		if (chb[i]==a)
		count++;
	return count;
		
		
	}
}
