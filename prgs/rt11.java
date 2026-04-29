import java.io.*;
import java.util.*;
class rt11{
  int a;
  int fact(rt11 x){
    int k=1;
    if(x.a==0){
      return 1;
    }
    if(x.a<0){
      return 0;
    }
    for(int y=x.a;y!=1;y--){
        k*=y;
    }
    return k;
  }
  public static void main(String X[]){
    rt11 w = new rt11();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter a number: ");
    w.a=s.nextInt(); int m=w.fact(w);
    System.out.print("Factorial is: ");
    if(m==0){
      System.out.println("Undefined");
    }else{
      System.out.println(m);
    }
  }
}
//PROGRAMMING LANGUAGE