class MultiThread2 extends Thread
  {
    public void run()
    {
      System.out.println("Jagadeesh");
    }

  }
class StartTread
  {
    public static void main(String args[])
    {
      MultiThread2 t=new MultiThread2();
      t.start();
      System.out.println(t.getName());
    }
  }