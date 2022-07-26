/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers. 
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/
public class ArithmeticException
{
  int div;
  ArithmeticException(int n1,int n2)
  {
    div=n1/n2;
    //ArithmeticException will occur
  }
  public static void main(String args[])
  {
    ArithmeticException obj=new ArithmeticException(10,0);
    System.out.println("Division of two numbers: "+obj.div);
  }
}

//Good Job!
