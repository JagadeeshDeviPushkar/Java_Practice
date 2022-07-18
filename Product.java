import java.util.Scanner;
class ProductDetails
  {
    int pid;
    String name;
    int pquantity;
    //Create a constructor
    ProductDetails(int pid, String name, int pquantity)
    {
      this.pid = pid;
      this.name = name;
      this.pquantity = pquantity;
    }
    void display()
    {
      System.out.println("Product id -"+pid);
      System.out.println("Product name -"+name);
      System.out.println("Product quantity -"+pquantity);
    }
  }
class ProductYear extends ProductDetails
  {
    int year;
    ProductYear(int pid, String name, int pquantity, int year)
    {
      super(pid, name, pquantity);
      this.year =year;
    }
      void yeardetails()
        {
        System.out.println("Product id - "+pid+" Product name - "+name+" Product quantity - "+pquantity+" Product quantity - "+pquantity+" Product year - "+year);
        }
    }
class Product
  {
    public static void main(String args[])
    {
      ProductYear p[] = new ProductYear[3];
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the product details:");
      for(int i=0; i<3; i++)
        {
          System.out.println("Enter the product id: ");
          int pid = sc.nextInt();
          System.out.println("Enter the product name: ");
          String name = sc.next();
          System.out.println("Enter the quantity: ");
          int pquantity = sc.nextInt();
          System.out.println("Enter the year");
          int year = sc.nextInt();
          p[i] = new ProductYear(pid,name,pquantity,year);
        }
      System.out.println("****Product information****");
      for(int i=0; i<3; i++)
        {
          p[i].yeardetails();
        }
    }
  }