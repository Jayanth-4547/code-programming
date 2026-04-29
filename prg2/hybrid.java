import java.util.*;
class h{
  int k=10;
}
class y extends h{
  int l=20;
}
class b extends y{
  int m=30;
}
class r extends y{
  int n=40;
  public static void main(String x[]){
    b b1=new b();
    r r1=new r();
    System.out.println(r1.k);
    System.out.println(r1.l);
    System.out.println(r1.n);
    System.out.println(b1.l);
    System.out.println(b1.m);
  }
}
class g extends y{
  int p=70;
  void hey(int s){
    System.out.println("super "+s); 
  }
}
class j extends g{
  int q=60;
  void hey(int s){
    System.out.println("Super "+s); 
  }
  public static void main(String x[]){
    j j1=new j();
    j1.hey(j1.k);
  }
}