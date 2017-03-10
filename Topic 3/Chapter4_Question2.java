import java.util.*;
public class Chapter4_Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x1;
		double x2;
		double y1;
		double y2;
		double d;
		double a;
		double r = 6371.01;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter point 1 (latitude and longitude) in degrees: \n");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		System.out.print("Enter point 2 (latitude and longitude) in degrees: \n");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		input.close();
		a=Math.acos((Math.sin(Math.toRadians(x1) )* Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1-y2))));
		d=r * a;
		System.out.print("The distance between the two points is: " + d +"km.\n");
	}

}
