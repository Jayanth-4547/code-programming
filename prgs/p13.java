import java.util.*;
class sam{
  int a;
  int b;

  void read(){
    Scanner x=new Scanner(System.in);
    System.out.println("Enter values to a & b: ");
    a=x.nextInt();
    b=x.nextInt();
  }
  
  void show(){
    System.out.print("Multiplication of a & b is "+(a*b));
  }
  
  public static void main(String args[]){
    sam s= new sam();
    s.read();
    s.show();
  }
  
}