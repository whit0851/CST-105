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
public class Calculator {
    public static void main(String[] args){
        if (args.length != 1){
            System.out.print("Usage: java Calcuator \"operand1 operator operand2\"");
            System.exit(1);
        }
        int num = 0;
        int dom = 0;
        String [] tokens = args[0].split(" ");
        
        switch(tokens[3].charAt(0)){
            case '+': num = Integer.parseInt(tokens[0]) * Integer.parseInt(tokens[6]) + Integer.parseInt(tokens[4]) * Integer.parseInt(tokens[2]); dom =  Integer.parseInt(tokens[2]) * Integer.parseInt(tokens[6]);break;
            case '-': num = Integer.parseInt(tokens[0]) * Integer.parseInt(tokens[6]) - Integer.parseInt(tokens[4]) * Integer.parseInt(tokens[2]); dom =  Integer.parseInt(tokens[2]) * Integer.parseInt(tokens[6]);break;
            case '*': num = Integer.parseInt(tokens[0]) * Integer.parseInt(tokens[4]); dom =  Integer.parseInt(tokens[2]) * Integer.parseInt(tokens[6]);break;
            case '/': num = Integer.parseInt(tokens[0]) * Integer.parseInt(tokens[6]); dom =  Integer.parseInt(tokens[2]) * Integer.parseInt(tokens[4]);break;
    }
    System.out.print( tokens[0] + tokens[1] + tokens[2] + ' ' + tokens[3] + ' ' + tokens[4] + tokens[5] + tokens[6] +  '=' + num + '/'+ dom);
    
    }
 }
