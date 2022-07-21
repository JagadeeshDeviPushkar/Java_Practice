class MultiThread extends Thread
  {
    public void run()
    {
      for(int i=1;i<=10;i++)
        {
          if(i%2==0)
          {
            try
              {
               Thread.sleep(150);
              }
            catch(Exception e)
              {
                System.out.println(e);
              }
            System.out.println(i);
          }
        }
    }
  }
class SleepThread
  {
    public static void main(String args[])
    {
      MultiThread t=new MultiThread();
      MultiThread t1=new MultiThread();
      MultiThread t2=new MultiThread();
      t.start();
      t1.start();
      t2.start();
      
    }
  }