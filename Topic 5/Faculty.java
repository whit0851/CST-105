/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Faculty extends Employee {
private String officehours, rank;

    public Faculty(String name, String address, String phonenumber, String email, String office, String datehired, int salary, String officehours, String rank) {
        super(name, address, phonenumber, email, office, datehired, salary);
    this.officehours=officehours;
    this.rank = rank;
    }
    public void setofficehours (String officehours){
        this.officehours= officehours;
}
    public void setrank(String rank){
        this.rank= rank;
    }
    public String getofficehours (){
        return officehours;
    }
    public String getrank(){
        return rank;
    }
}
