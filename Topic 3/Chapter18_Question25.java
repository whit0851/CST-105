import java.util.*;
public class Chapter18_Question25 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s1 = input.nextLine();
		input.close();
		displayPermutation(s1);

	}
	public static void displayPermutation(String s){
		displayPermutation("", s);
	}
	public static void displayPermutation(String s1, String s2){
		int n = s2.length();
		if (n == 0)
			System.out.print(s1+"\n");
		else{
			for(int i =0; i <n; i++)
			displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i+1, n));
		}
		}
}
