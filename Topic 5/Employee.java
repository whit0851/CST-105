/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Employee extends Chapter11_Question2 {
    private String office, datehired;
    private int salary;
    public Employee(String name, String address, String phonenumber, String email, String office, String datehired, int salary) {
        super(name, address, phonenumber, email);
        this.office = office;
        this.datehired = datehired;
        this.salary = salary;
    }
    public void setoffice(String office){
        this.office = office;
    }
    public void setdatehired (String datehired){
        this.datehired = datehired;
    }
    public void setsalary(int salary){
        this.salary=salary;
    }
    public String getoffice(){
        return office;
    }
    public String getdatehired(){
        return datehired;
    }
    public int getsalary(){
        return salary;
    }
            
}
