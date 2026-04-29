import java.util.*;
class smpl{
  int a;
  int b;

  void add(){
    System.out.print("Addition of a & b is "+(a+b));
  }

  public static void main(String args[]){
    smpl s=new smpl();
    s.a=20;
    s.b=30;
    s.add();
  }

}