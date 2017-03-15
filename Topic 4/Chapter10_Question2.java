import java.util.*;
public class Chapter10_Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 class BMI{
	private String name;
	private int age;
	private  double weight;
	private double feet;
	private double inches;
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double METERS_PER_INCH = 0.0254;
public BMI ( String name, int age, double weight, double feet, double inches){
	this.name = name;
	this.age = age;
	this.weight = weight;
	this.feet = feet;
	this.inches = inches;
}
public double getBMI() {
double bmi = weight * KILOGRAMS_PER_POUND /
((((feet*12)+inches) * METERS_PER_INCH) * (((feet*12)+inches) * METERS_PER_INCH));
return Math.round(bmi * 100) / 100.0;

}
public String getStatus() {
	double bmi = getBMI();
		if (bmi < 18.5)
			return "Underweight";
		else if (bmi < 25)
			return "Normal";
		else if (bmi < 30)
			return "Overweight";
		else
			return "Obese";
 }
public String getName() {
	return name;
 	}

public int getAge() {
	return age;
	}

public double getWeight() {
	return weight;
 	}

public double getfeet() {
 return feet;
 }
public double getinches() {
	 return inches;
	 }
}