import java.util.Scanner;
class Display
  {
    String name;
    Double deposit;
    Double costPerDay;
    void setName(String n)
    {
      name=n;
    }
    String getName()
    {
      return name;
    }
    void setDeposit(Double d)
    {
      deposit=d;
    }
    Double getDeposit()
    {
      return deposit;
    }
    void setCostperDay(Double c)
    {
      costPerDay=c;
    }
    Double getCostperDay()
    {
      return costPerDay;
    }
  }
class Main
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      Display item =new Display();
      System.out.println("Enter item name: ");
      item.setName(sc.next());
      System.out.println("Enter Depoist: ");
      item.setDeposit(sc.nextDouble());
      System.out.println("Enter Cost per day: ");
      item.setCostperDay(sc.nextDouble());
      System.out.println(item.getName());
      System.out.println(item.getDeposit());
      System.out.println(item.getCostperDay());
    }
    
  }