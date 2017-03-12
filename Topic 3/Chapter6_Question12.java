import java.util.*;
public class Chapter6_Question12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter two Characters and the number of Characters per Line: ");
		char ch1 = input.next().charAt(0);
		char ch2 = input.next().charAt(0);
		int perline = input.nextInt();
		input.nextLine();
		input.close();
		printChars(ch1, ch2, perline);
	}

	public static void printChars(char ch1, char ch2, int numberPerLine){
	
		for(int i = 1; ch1 < ch2 + 1; i++){
			if(i%numberPerLine==0)
				System.out.printf("%-2s\n", ch1);
			else
				System.out.printf("%-2s", ch1);
			ch1++;
		}
		
	}
}
