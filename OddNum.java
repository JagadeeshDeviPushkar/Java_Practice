/* Write a JAVA program to print all odd number between 1 to 100. 
*/

class OddNum
  {
    public static void main(String args[])
    {
      int a = 1;
      while(a<=100)
        {
          if(a%2!=0)
          {
            System.out.println(a);
          }
          a++;
        }
    }
  }