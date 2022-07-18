import java.util.Scanner;
class RevWords
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      String rev = "";
      System.out.println("Enter the string:");
      String str = sc.nextLine();
      String words[] = str.split(" ");
      for(int i=0; i<words.length; i++)
        {
          String revword = "";
          String word = words[i];
          for(int j=word.length()-1; j>=0; j--)
            {
              revword = revword+word.charAt(j);
            }
          rev = rev + revword + " ";
        }
      System.out.println("After reverse:");
      System.out.print(rev);
      
    }
  }