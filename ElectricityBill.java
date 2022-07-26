/* 4. Write a program to Calculate Electricity Bill. Accept last month units and present units in string format from the user. 
      Calculate Electricity Bill for last month units, otherwise throw ArithementicException along with some error message.  
      Handle NumberFormatException while converting units into numerical value. 

  Calculate Electricity Bill based on following charges:

  ==> first 50 units charges are: 0.50 per/unit
  ==> next 100 units charges are: 1.75 per/unit
  ==> next 100 units charges are: 2.50 per/unit
  ==> above 250 units charges are: 2.90 per/unit

  Add 10% surcharge on overall bill.

*/
import java.util.Scanner;
public class ElectricityBill {

    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the last month units: ");
      String last = sc.next();
      System.out.println("Enter the present units: ");
      String present = sc.next();
      try
        {
          double l = Double.parseDouble(last);
          double p = Double.parseDouble(present);
          double units = p-l;
          double bill = 0;
          if(units<=50)
          {
            bill=0.5*units;
          }
          else if(units<=150&&units>50)
          {
            bill=(0.5*50)+(units-50)*1.75;
          }
          else if(units<=250&&units>150)
          {
            bill=(0.5*50)+(100*1.75)+(units-150)*2.50;
          }
          else
          {
            bill=(0.5*50)+(100*1.75)+(100*2.50)*(units-250)*2.90;
          }
          double surcharge=(bill/100)*10;
          bill=bill+surcharge;
          System.out.println("the bill for "+units+" is "+bill);
        }
      catch(Exception e)
        {
          System.out.println("invaild conversion");
        }

    }
}
