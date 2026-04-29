import java.util.*;
class x4{
  int a;
  int b;
  x4(){
    a=10;
    b=20;
  }
  x4(int x, int y){
    a=x;
    b=y;
  }
  void add(){
    System.out.println("Addition of a & b is: "+(a+b));
  }
  public static void main(String args[]){
    x4 r = new x4();
    r.add();
    x4 r1 = new x4(50,60);
    r1.add();
  }
}