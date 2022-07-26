//By using method we are calling the function.
class BikeMethod
  {
    static void braking() //static method
    {
      System.out.println("Brakes are applied");
    }
    void mileage(int s) //instance method
    {
      System.out.println("Mileage is: "+s+" kmph");
    }
    public static void main(String args[])
    {
      BikeMethod RoyalEnfield = new BikeMethod();
      BikeMethod R15 = new BikeMethod();
      BikeMethod Duke = new BikeMethod();

      RoyalEnfield.braking(); //calling the static method
      R15.braking();
      Duke.braking();

      RoyalEnfield.mileage(40); //calling the instance method
      R15.mileage(30);
      Duke.mileage(25);
    }
  }