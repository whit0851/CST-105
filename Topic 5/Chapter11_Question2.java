import java.util.*;
/*
 * To hange this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charlesw
 */
public class Chapter11_Question2 {
    private String name;
    private String address;
    private String phonenumber;
    private String email;
    
    public Chapter11_Question2(String name, String address, String phonenumber, String email){
        this.name= name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.email = email;
    }
    public void setName (String name){
        this.name = name;
    }
    public String getName(){
            return name;
    }
    public void setaddress (String address){
        this.address = address;
    }
    public String getaddress(){
            return address;
    }
    public void setphonenumber (String phonenumber){
        this.phonenumber = phonenumber;
    }
    public String getphonenumber(){
            return phonenumber;
    }
    public void setemail (String email){
        this.email = email;
    }
    public String getemail(){
            return email;
    }
}
