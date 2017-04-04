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
public class Chapter11_Question17 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
          int m = input.nextInt();
          int n = 0;
          input.close();
          int cal = 0;
          for (int i = 2; i < m; i++)
                    if (m%i==0){              
                        list.add(i);
                        m = m/i;
                        i=1;
                    } 
            list.add(m);
          for (int i = 0; i <list.size(); i ++){
               System.out.print(list.get(i) + " ");
           }
               
    }
}
