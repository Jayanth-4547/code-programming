//Differentiate btw static and non-static methods in java
import java.util.*;
public class n6{
  static int SOperation(int a, int b){
    return a+b;
  }
  int Operation(int a, int b){
    return a*b;
  }
  public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int x=s.nextInt();
    System.out.print("Enter a number: ");
    int y=s.nextInt();
    System.out.println("Using Static method: "+n6.SOperation(x,y));
    n6 n = new n6();
    System.out.println("Using Non-Static method: "+n.Operation(x,y));
  }
}