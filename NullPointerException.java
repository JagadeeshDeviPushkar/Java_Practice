/*4. Write a program which will illustrate NullPointerException. Create student class along with name, marks and city and add setter methods and getter methods.
  Create a method which can take student class as a parameter and print name, marks and city in method business logic.
  Write your comments regarding NullPointerException such "When NullPointerException will occur in program?"
*/

class Student
  {
    String name;
    int marks;
    String city;
    void setName(String name)
    {
      this.name =name;
    }
    String getName()
    {
      return name;
    }
    void setMarks(int marks)
    {
      this.marks =marks;
    }
    int getMarks()
    {
      return marks;
    }
    void setCity(String city)
    {
      this.city =city;
    }
    String getCity()
    {
      return city;
    }
  }
public class NullPointerException {

    public static void main(String args[]) {
      Student st = new Student();
      st.name=null;
      st.city="Bangalore";
      st.marks=100;
      System.out.println(st.name.length());
      //NullPointerException will occur
      System.out.println(st.city);
      System.out.println(st.marks);

    }
}

//Good Job!

