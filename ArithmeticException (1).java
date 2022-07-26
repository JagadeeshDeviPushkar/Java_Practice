/* 1. Write a program to accept two numbers, one Arithmetic operator such as +, -, / , *  and print output of Arithmetic operation. 
   Write switch case to perform each operation. Handle ArithmeticException when you are performing division operation. 
*/
import java.util.Scanner;
public class ArithmeticException
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a value ");
      int a = sc.nextInt();
      System.out.println("Enter b value ");
      int b = sc.nextInt();
      System.out.println("Enter Arithmetic Operator [+ or - or * or /]");
      char operator = sc.next().charAt(0);
      switch(operator)
        {
          case '+':
              System.out.println(a+b);
              break;
          case '-':
              System.out.println(a-b);
              break;
          case '*':
              System.out.println(a*b);
              break;
          case '/':
              try
                {
                  System.out.println(a/b);
                }
              catch(Exception e)
                {
                  System.out.println("Cant divide");
                }
            break;
          default:
            System.out.println("Invaild key");
        }
    }
  }