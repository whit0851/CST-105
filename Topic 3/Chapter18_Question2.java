import java.util.*;
public class Chapter18_Question2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index for the Fibonacci series: ");
		int index = input.nextInt();
		input.close();
		int f0 = 0;
		int f1 = 1;
		int currentfib = 0 ;
		if(index > 1){
			for (int i = 1; i <index; i ++){
				currentfib = f0 + f1;
				f0 = f1;
				f1 = currentfib;	
			}
				System.out.print("The Fibonacci number for an index of " + index +" is " + currentfib);
			}
		else if(index<1)
			System.out.print("The Fibonacci number for an index of " + index +" is 0");
		else	
			System.out.print("The Fibonacci number for an index of " + index +" is 1");
	}
		
	}
	

