import java.util.*;
public class Chapter6_Question5 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Please enter three numbers: ");
	
	double num1 = input.nextDouble();
	double num2 = input.nextDouble();
	double num3 = input.nextDouble();
	input.close();
	displaySortedNumbers(num1, num2, num3);
	
	
	}
public static void displaySortedNumbers(double num1, double num2, double num3){
	double [] a = {num1, num2, num3};
		
	//SelectionSort.java from the book
	for (int i = 0; i < a.length -1; i ++){
				double currentMin = a[i];
				int currentMinIndex = i;
				
				for (int j = i + 1; j < a.length; j++){
					if (currentMin > a[j]){
						currentMin = a[j];
						currentMinIndex = j;
					}
					}
				if(currentMinIndex != i){
					a[currentMinIndex] = a[i];
					a[i]= currentMin;
				}
		
		}
System.out.print(a[0] + " "+ a[1] + " " + a[2]);
	

}	
}
