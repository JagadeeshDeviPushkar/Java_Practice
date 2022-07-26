// Maximum number comparison
import java.util.Scanner;
class InstanceMethod
  {
    int i;
    int j;
    void max(int a, int b)
    {
      if(a>b)
        System.out.println(a+" is max");
      else
        System.out.println(b+" is max");
    }
    public static void main(String args[])
    {
      InstanceMethod obj = new InstanceMethod();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two numbers");
      int c = sc.nextInt();
      int d = sc.nextInt();
      obj.max(c,d);
    }
  }