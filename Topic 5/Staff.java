/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Staff extends Employee {
private String title;
    public Staff(String name, String address, String phonenumber, String email, String office, String datehired, int salary, String title) {
        super(name, address, phonenumber, email, office, datehired, salary);
    this.title = title;
    }
    public void settitle(String title){
        this.title=title;
    }
    public String gettitle(){
        return title;
    }
}
