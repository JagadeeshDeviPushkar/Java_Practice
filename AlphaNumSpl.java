import java.util.Scanner;
class AlphaNumSpl
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the string: ");
      String str =sc.nextLine();
      int  alpha= 0;
      int num = 0;
      int spl = 0;
      for(int i=0; i<str.length(); i++)
        {
          char ch= str.charAt(i);
          if(ch>='a' && ch<='z' || ch>='A'&& ch <='Z')
          {
            alpha++;
          }
          else if(ch>='0'&&ch<='9')
          {
            num++;
          }
          else
          {
            spl++;
          }
        }
      System.out.println("Alphabets : "+alpha);
      System.out.println("Numbers: "+num);
      System.out.println("Specail characters: "+spl);
    }
  }