class CallbyValue
  {
    int a;
    int b;
    static void add(int s, int j) //parameters
    {
      s = 10;
      System.out.println("Result for method: "+(s+j));
    }
    public static void main(String args[])
    {
      CallbyValue obj = new CallbyValue();
      obj.a = 20;
      obj.b = 30;
      System.out.println("Before passing: "+(obj.a+obj.b));
      add(obj.a, obj.b); //arguments
      System.out.println("After passing: "+(obj.a+obj.b));
    }
  }