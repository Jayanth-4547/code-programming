// WAJP to read different primitive values & convert into object using primitive classes & again convert back to primitive values & display
import java.util.*;
class rt4{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
      //reading values
      System.out.println("Enter a Integer: ");
      int a = s.nextInt();
      s.nextLine();
      System.out.println("Enter a Float: ");
      float b = s.nextFloat();
      s.nextLine();
      System.out.println("Enter a Character: ");
      char c = s.next().charAt(0);
      s.nextLine();
      System.out.println("Enter a Double: ");
      double d = s.nextDouble();
      s.nextLine();
      System.out.println("Enter a Byte: ");
      byte e = s.nextByte();
      s.nextLine();
      System.out.println("Enter a Boolean: ");
      boolean f = s.nextBoolean();
      s.nextLine();
      System.out.println("Enter a Long: ");
      long g = s.nextLong();
      s.nextLine();
      System.out.println("Enter a Short: ");
      short h = s.nextShort();
      s.nextLine();
      //converting primitive values to wrapper objects
      Integer woa = a;
      Float wob = b;
      Character woc = c;
      Double wod = d;
      Byte woe = e;
      Boolean wof = f;
      Long wog = g;
      Short woh = h;
      //converting back
      int a1=woa.intValue();
      float b1=wob.floatValue();
      char c1=woc.charValue();
      double d1=wod.doubleValue();
      byte e1=woe.byteValue();
      boolean f1=wof.booleanValue();
      long g1=wog.longValue();
      short h1=woh.shortValue();
      //displaying values
      System.out.println("///Displaying///");
      System.out.println("Integer: "+a1);
      System.out.println("Float: "+b1);
      System.out.println("Character: "+c1);
      System.out.println("Double: "+d1);
      System.out.println("Byte: "+e1);
      System.out.println("Boolean: "+f1);
      System.out.println("Long: "+g1);
      System.out.println("Short: "+h1);
      
  }
}