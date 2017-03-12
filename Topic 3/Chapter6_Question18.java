import java.util.*;
import java.util.regex.*;
public class Chapter6_Question18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a password: ");
		String password = input.nextLine();
		input.close();
		check(password);
	}
	public static void check(String str1){
		String pattern1 = "^[a-zA-Z0-9]*$";
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher(str1);
		int count = 0;
		if(str1.length()>=8)
			if(str1.matches(pattern1))
				while(m.find())
					count ++;
				if(count>=2)
				System.out.print("Valid Password");
				
		else
			System.out.print("Invalid Password");
		
		
	}
	
	
}
