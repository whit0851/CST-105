/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Student extends Chapter11_Question2 {
  private final String Classstatus;
    
    public Student(String name, String address, String phonenumber, String email, String Classstatus) {
        super(name, address, phonenumber, email);
        this.Classstatus = Classstatus;
    }
    public String getClassstatus(){
        return Classstatus;
        
    }
   }

