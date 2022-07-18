class Subtraction
  {
    void sub(int a, int b)
    {
      System.out.println((a-b));
    }
    void sub(int a, int b, int c)
    {
      System.out.println(a-b-c);
    }
  }
class SubNum
  {
    public static void main(String args[])
    {
      Subtraction minus = new Subtraction();
      minus.sub(15,6);
      minus.sub(20,10,5);
    }
  }