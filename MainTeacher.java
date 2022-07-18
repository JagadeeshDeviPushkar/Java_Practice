class Teacher
  {
    String name;
    String address;
    int  tid;
    void details()
    {
      System.out.println("Teaching");
    }
  }
class MathTeacher extends Teacher
  {
    String subject;
    void sub()
    {
      System.out.println("Maths");
    }
  }
class PhysicsTeacher extends MathTeacher
  {
    
  }
class MainTeacher
  {
    public static void main(String args[])
    {
      MathTeacher math = new MathTeacher();
      math.name = "Jagadeesh";
      math.address = "Rajahumdry";
      math.tid = 12345;
      math.subject ="Mathematics";
      System.out.println(math.name+" "+math.address+" "+math.tid+" "+math.subject);
      math.details();
      math.sub();
      PhysicsTeacher phy = new PhysicsTeacher();
      phy.name = "Santosh";
      phy.address = "Rajahumdry";
      phy.tid = 23644;
      phy.subject = "Physics";
      System.out.println(phy.name+" "+phy.address+" "+phy.tid+" "+phy.subject);
      phy.details();
      
    }
    
  }