/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Checking extends Account {

    public Checking(int newid, double newbalance) {
        super(newid, newbalance);
    }
    public void setbalnancewithdraw(double wnewbalance){
	double Cbalance = getbalance();
        if(Cbalance-wnewbalance>-100){
            Cbalance = Cbalance - wnewbalance;
           setbalance(Cbalance); 
        }
        else{}
        
    }
}
