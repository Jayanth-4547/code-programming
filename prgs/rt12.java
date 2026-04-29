import java.io.*;
import java.util.*;
class rt12{
  int x;
  int gcd(int x,int y){
    int i=(x<y?x:y),k=i;
    if(i==0){
      return (x>y?x:y);
    }
    while(i>=1){
      if((x%i==0&&y%i==0)){
        return i;
      }
      i--;
    }
    return k;
  }
  rt12 gcd(rt12 h,rt12 d){
    rt12 r = new rt12(gcd(gcd(x,h.x),d.x));
    return r;
  }
  rt12(int x){
    this.x=x;
  }
  rt12(){}//empty constructor
  void show(){
    System.out.println("Greatest Common Divisor is: "+x);
  }
  public static void main(String X[]){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter a number: ");
    rt12 w = new rt12(s.nextInt());
    System.out.print("Enter a number: ");
    rt12 h = new rt12(s.nextInt());
    System.out.print("Enter a number: ");
    rt12 d = new rt12(s.nextInt());
    rt12 k = new rt12();
    k=w.gcd(h,d);
    k.show();
  }
}