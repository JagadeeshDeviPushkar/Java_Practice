//JFM1T3_Assignment4:
/*
1.Write a program to store your best friend's mobile number in a variable and print the last 4 digits. Consider the following sample for reference.
  Mobile number should accept only 10 digits. Not less than 10 digits or greater than 10 digits. 
  Allow user to input the phone number from the terminal

  Sample Input:
        mobileNum=9393927890

  Expected Output:
        Your friend's mobile number ends with ******7890

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class MobileNumber {

//Define the main method
  public static void main(String args[]){
//Declare the variable
    String mobileNum;
    String lastFourDigits;

//Use the scanner class to provide mobileNum at execution time

/*
Scanner scanner = new Scanner(System.in);
System.out.println("Enter phone number (10 digits)");
mobileNum = scanner.nextLine();
*/
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter phone number (10 digits)");
    mobileNum = scanner.nextLine();

//Verify if the mobile number is equal to 10 digits or not
    String regex = "\\d{10}";
//If the mobile number is equal to 10 digits then extract the last 4 digits else print error message
    if (mobileNum.length() > 4) 
    {
      lastFourDigits = mobileNum.substring(mobileNum.length() - 4);
    } 
    else
    {
    lastFourDigits = mobileNum;
    }
//Print the result
//System.out.println("Mobile number ends with ******"+variablename);
    System.out.println("Mobile number ends with ******"+lastFourDigits);
    }
}

// Kindly work on the indentation.
