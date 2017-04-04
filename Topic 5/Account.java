import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charlesw
 */
public class Account {
        private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	Account(int newid, double newbalance){
		id = newid;
		balance = newbalance;
	}
		int getid(){
			return id;
	}
		double getbalance(){
			return balance;
	}
		double getannualInterestRate(){
			return annualInterestRate;
	}
		Date getdateCreated(){
			return dateCreated;
	}
		public void setid(int newid){
			id = newid;
	}
		public void setbalance(double newbalance){
			balance = newbalance;
	}
		public void setannualInterestRate(double newannualInterestRate){
			annualInterestRate = newannualInterestRate;
	}
		double getMonthlyInterestRate(){
			return annualInterestRate/(12*100);
	}
		double getMonthlyInterest(){
			return balance*(annualInterestRate/(12*100));
	}
		public void setbalnancewithdraw(double wnewbalance){
			balance = balance - wnewbalance;
	}
		public void setbalnancedeposit(double dnewbalance){
			balance = balance + dnewbalance;
	}
}

    

