import java.lang.Math;
import java.util.*;
class M2 {
  public static void main(String[] args) {
    double a=0;
    Scanner sob = new Scanner(System.in);
    while(a==0){
      System.out.print("ax^2+bx+c=0\nenter a: "); 
      a=sob.nextDouble();
    }
    System.out.print("enter b: ");
    double b=sob.nextDouble();
    System.out.print("enter c: ");
    double c=sob.nextDouble();
    double d=b*b-4*a*c;
    double x1=(-b+Math.sqrt(d))/(2*a);
    double x2=(-b-Math.sqrt(d))/(2*a);
    double t=(Math.sqrt(-d)/(2*a));
    double x=(-b/(2*a));
    System.out.print("the solutions of the equation "+a+"x^2 + "+b+"x + "+c+" = 0 are ");
    if(d>0){
      System.out.println("real:\nX1: "+x1+" and X2: "+x2);
    }
    else if(d<0){
      System.out.println("complex:\nX1: "+x+" - "+t+"i and X2: "+x+" + "+t+"i");
    }
    else{
      System.out.println("real and same:\nX1: "+x1+" and X2: "+x2);
    }
    sob.close();
  }
}