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
public class Transactions {
   private java.util.Date date;
   private char type;
   private double balance, amount;
   private String description;
Transactions(char type, double amount, double balance, String description){
    this.type =type;
    this.amount = amount;
    this.balance = balance;
    this.description = description;
}
}
