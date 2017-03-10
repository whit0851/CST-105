import java.util.*;
public class Chapter4_Question23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		payroll payroll1 = new payroll();
		System.out.print("Enter employee's name: ");
		payroll1.setname(input.nextLine());
		System.out.print("Enter number of hours worked in a week: ");
		payroll1.sethour(input.nextDouble());
		System.out.print("Enter hourly pay rate: ");
		payroll1.setrate(input.nextDouble());
		System.out.print("Enter federal tax withholding rate: ");
		payroll1.setftaxrate(input.nextDouble());
		System.out.print("Enter state tax withholding rate: ");
		payroll1.setstaxrate(input.nextDouble());
	
		System.out.print("Employee Name: " + payroll1.getname() +"\nHours Worked: " + payroll1.gethour() + "\nPay Rate: $" + payroll1.getrate() + "\nGross Pay: $"+ payroll1.gpay() + "\nDeductions: \nFederal Withholding ("+payroll1.getftaxrate()*100+ "%): "+payroll1.getftaxrate()*payroll1.gpay()+"\nState Withholdings ("+payroll1.getstaxrate()*100+ "%): "+payroll1.getstaxrate()*payroll1.gpay()+"\nTotal Deduction: "+(payroll1.gpay()*payroll1.getftaxrate() + payroll1.gpay()*payroll1.getstaxrate())+ "\nNet Pay: "+payroll1.npay());
	}


}
 class payroll{
	private String name;
	private double hour;
	private double rate;
	private double ftaxrate;
	private double staxrate;
	 
	 public void setname(String newname){
		 name = newname;
	 }
	 String getname(){
		 return name;
	 }
	 public void sethour(double newhour){
		 hour = newhour;
	 }
	 double gethour(){
		 return hour;
	 }
	 public void setrate(double newrate){
		 rate = newrate;
	 }
	 double getrate(){
		 return rate;
	 }
	 public void setftaxrate(double newftaxrate){
		 ftaxrate = newftaxrate;
	 }
	 double getftaxrate(){
		 return ftaxrate;
	 }
	 public void setstaxrate(double newstaxrate){
		 staxrate = newstaxrate;
	 }
	 double getstaxrate(){
		 return staxrate;
	 }
	 double gpay(){
	 return hour * rate;
	 }
	 double npay(){
		 return hour*rate-(ftaxrate)*hour*rate-(staxrate)*hour*rate;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
 }