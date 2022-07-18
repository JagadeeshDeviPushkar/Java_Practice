// Write a JAVA program to count frequency of each character in a string
import java.util.Scanner;
class EachFrequency
  {
    public static void main(String args[])
    {
      int i, j, freq;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the string: ");
      String str = sc.nextLine();
      char[] string = str.toCharArray();
      for(i=0; i<str.length(); i++)
        {
          freq=1;
          for(j=i+1; j<str.length(); j++)
            {
              if(string[i]==string[j])
              {
                freq++;
                string[j]=' ';
              }
            }
          if(string[i]!=' ')
          {
            System.out.println("The character of "+string[i]+"-"+freq);
          }
        }
    }
  }