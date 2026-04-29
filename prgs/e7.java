import java.util.*;
class x3{
  int add(int x, int y){
    int k=x+y;
    return k;
  }
  int mul(int x, int y){
    int k=x*y;
    return k;
  }
  public static void main(String args[]){
    x3 r = new x3();
    Scanner s=new Scanner(System.in);
    System.out.println("Enter x & y: ");
    int a=s.nextInt();
    int b=s.nextInt();
    System.out.println("Addition of "+a+" and "+b+" is: "+r.add(a,b));
    System.out.println("Multiplication of "+a+" and "+b+" is: "+r.mul(a,b));
  }
}