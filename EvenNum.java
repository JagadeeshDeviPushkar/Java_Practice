/*  Write a JAVA program to print all even numbers between 1 to 100. - using while loop  */

class EvenNum
  {
    public static void main(String args[])
    {
      int a = 1;
      while(a<=100)
        {
          if(a%2==0)
          {
            System.out.println(a);
          }
          a++;
        }
    }
  }