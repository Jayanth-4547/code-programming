//overload constructors
import java.util.*;
public class n8{
  int x,y;
  n8(){
    x=10;
    y=5;
  }
  n8(int x){
    this.x=x;
    y=5;
  }
  public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int x=s.nextInt();
    n8 n=new n8();
    n8 n1=new n8(x);
    System.out.println("default: "+n.x+" "+n.y);
    System.out.println("with parameter: "+n1.x+" "+n1.y);
  }
}