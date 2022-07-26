class Bike
  {
    static int wheels = 2; //static variable - it has same for all objects
    String color; //instance variable
    public static void main(String args[])
    {
      Bike RoyalEnfield = new Bike();
      Bike RC15 = new Bike();
      Bike Duke = new Bike();
      System.out.println("No of wheels: "+RoyalEnfield.wheels);
      System.out.println("No of wheels: "+RC15.wheels);
      System.out.println("No of wheels: "+Duke.wheels);
      RoyalEnfield.color = "Black";
      RC15.color = "Red";
      Duke.color = "Orange";
      System.out.println("Color of RoyalEnfield: "+RoyalEnfield.color);
      System.out.println("Color of RC15: "+RC15.color);
      System.out.println("Color of Duke: "+Duke.color);
    }
  }