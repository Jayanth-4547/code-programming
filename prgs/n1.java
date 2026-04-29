import java.util.*;
class n1{
  int add(int x,int y){
    return x+y;
  }
  int sub(int x,int y){
    return x-y;
  }
  int mul(int x,int y){
    return x*y;
  }
  float div(float x,float y){
    return x/y;
  }
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    n1 n=new n1();
    System.out.print("Enter a number: ");
    int x=s.nextInt();
    System.out.print("Enter a number: ");
    int y=s.nextInt();
    System.out.println("Addition: "+n.add(x,y));
    System.out.println("Subtraction: "+n.sub(x,y));
    System.out.println("Multiplication: "+n.mul(x,y));
    System.out.println("Division: "+n.div(x,y));
  }
}