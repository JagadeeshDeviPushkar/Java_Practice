//Write a JAVA program to count total number of vowels and consonants in a string.
import java.util.Scanner;
class VowelCons
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string");
      String s = sc.nextLine();
      int vcount = 0;
      int ccount = 0;
      for(int i=0; i<s.length(); i++)
        {
          int ch = s.charAt(i);
          if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
          {
            vcount++;
          }
          else
          {
            ccount++;
          }
        }
      System.out.println("Vowels count are: "+vcount);
      System.out.println("Consants count are: "+ccount);
    }
  }