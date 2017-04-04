/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Savings extends Account {

    public Savings(int newid, double newbalance) {
        super(newid, newbalance);
    }
    public void setbalnancewithdraw(double wnewbalance){
	double Bbalance = getbalance();
        if(Bbalance-wnewbalance>0){
            Bbalance = Bbalance - wnewbalance;
           setbalance(Bbalance); 
        }
        else{}
        
    }
}
