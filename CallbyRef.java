class CallbyRef
  {
    int a;
    int b;
    private static void add(CallbyRef op, CallbyRef op1)
    {
      op.a = 10;
      System.out.println("Result from method: "+(op.a+op.b));
    }
    public static void main(String args[])
    {
      CallbyRef op = new CallbyRef();
      CallbyRef op1 = new CallbyRef();
      op.a = 20;
      op.b = 30;
      System.out.println("Before passing: "+(op.a+op.b));
      add(op, op); //calling method
      System.out.println("After passing: "+(op.a+op.b)); //variable change bcoz change in method
    }
  }