
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charlesw
 */
public class Calender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.print("Please enter a month: ");
        int month = input.nextInt()-1;
        int day = 1;
        Calendar cal = new GregorianCalendar(year, month, day);
        System.out.print("Sun Mon Tue Wed Thur Fri Sat");
            int weekday = cal.get(Calendar.DAY_OF_WEEK);
            //System.out.print(weekday);
            switch (weekday){
                case 1: System.out.print("\n " + day); break;
                case 2: System.out.print("\n     " + day); break;
                case 3: System.out.print("\n         " + day); break;
                case 4: System.out.print("\n             " + day); break;
                case 5: System.out.print("\n                 " + day); break;
                case 6: System.out.print("\n                      " + day); break;
                default: System.out.print("\n                          " + day); break;
            }
    for(int i = 2;i <10; i++){
        if(weekday%7==0){
            System.out.print("\n "+ i);
        }
        else{
            System.out.print("   "+ i);
        }
        weekday++;
    }
    for(int i = 10;i <cal.getActualMaximum(Calendar.DAY_OF_MONTH)+1; i++){
        if(weekday%7==0){
            System.out.print("\n "+ i);
        }
        else{
            System.out.print("  "+ i);
        }
        weekday++;
    }
    System.out.print("\n");
    }
}
