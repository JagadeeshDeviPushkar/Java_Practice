/* 2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbers 
   using next() method of scanner class. Convert into numerical values and print addition of two numbers. 
   Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
*/
import java.util.*;
public class NumberFormatException {
    int test(int a,int b)
      {
        return a+b;
      }

    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      NumberFormatException obj = new NumberFormatException();
      System.out.println("Enter a first number");
      String num1 = sc.next();
      System.out.println("Enter the second number");
      String num2 = sc.next();
      int i=Integer.parseInt(num1); //if we not convert into integer then it shows NumberFormatException
      int j=Integer.parseInt(num2);
      int sum=obj.test(i,j);
      
      System.out.println("sum = "+sum);
    }
}
//accept two numbers 
//   using next() method of scanner class. Convert into numerical values and print addition of two numbers.
