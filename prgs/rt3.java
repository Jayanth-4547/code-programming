import java.util.*;
class rt3{
  int a,b;
  rt3(int a, int b){
    this.a=a;
    this.b=b;
  }
  void show(){
    System.out.print("a="+a+" b="+b);
  }
  public static void main(String args[]){
    rt3 r = new rt3(11,22);
    r.show();
    rt3 s = r;
    s.a++;
    s.b++;
    r.show();
    r.a++;
    r.b++;
    s.show();
    rt3 t = s;
    s.a++;
    s.b++;
    t.show();
  }
}