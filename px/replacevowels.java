//13. Program to read a string and replace all the vowels with a ‘S’ symbol.
import java.util.*;
class rv{
  public static void main(String o[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a String: ");
    String n=s.nextLine();
    n=n.replace("a","$").replace("e","$").replace("i","$").replace("o","$").replace("u","$");
    System.out.println("String: "+n);
  }
}