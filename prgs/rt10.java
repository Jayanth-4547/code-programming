// gcd and lcm of three numbers
import java.io.*;
import java.util.*;
class rt10{
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
  int gcd(int x,int y,int z){
    return gcd(gcd(x,y),z);
  }
  int lcm(int x,int y,int z){
    if(x!=0&y!=0&z!=0){
      return (((x*y*z)*gcd(x,y,z))/(gcd(x,y)*gcd(y,z)*gcd(x,z)));
    }else{
      return 1;
    }
  }
  public static void main(String X[]){
    int x=Integer.parseInt(X[0]);
    int y=Integer.parseInt(X[1]);
    int z=Integer.parseInt(X[2]);
    rt10 w = new rt10();
    System.out.println("Greatest Common Divisor is: "+w.gcd(x,y,z));
    System.out.print("Least Common Multiple is: ");
    int q=w.lcm(x,y,z);
    if(q==1){
      System.out.println("UnDefined");
    }else{
      System.out.println(q);
    }
  }
}