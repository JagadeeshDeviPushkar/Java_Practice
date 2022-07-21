import java.util.*;

class InvalidMobilenumberException extends Exception
  {
    public InvalidMobilenumberException(String msg)
    {
      super(msg);
    }
  }

class MobileNumber
  {
    public  static void validate(String mobilenumber) throws InvalidMobilenumberException
    {
      if(mobilenumber.length()<10)
      {
        throw new InvalidMobilenumberException("invalid mobile number");
      }
      else
      {
        System.out.println(mobilenumber);
      }
    }
    public static void main(String args[])
    {
      try
        {
          validate("9703182015");
        }
      catch(InvalidMobilenumberException ex)
        {
          System.out.println(ex);
        }
    }

  }