/* 3. Write a program to accept firstName, lastName and mobileNumber in string format. 
   Print number of characters in firstName and lastName, and print sum of digits of a mobileNumber. 
   Handle NumberFormatException while converting mobileNumber to long.
*/
import java.util.Scanner;
public class NumberFormatException {

    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a first name");
      String firstname = sc.next();
      System.out.println("Enter the last name");
      String lastname = sc.next();
      System.out.println("Enter the mobile number");
      String mobileNumber = sc.next();
      System.out.println("Length of the first name string is: "+firstname.length());
      System.out.println("Length of the last name string is: "+lastname.length());
      try
        {
          long number=Long.parseLong(mobileNumber);
          long rem, sum=0;
          while(number>0)
          {
            rem = number%10;
            sum = sum+rem;
            number = number/10;
          }
          System.out.println("Sum of the phone number is: "+sum);
        }
      catch (Exception e)
        {
          System.out.println("Conversion failed "+e);
        }
    }
}