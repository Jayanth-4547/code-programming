import java.util.*;
class M5{
  public static void main(String[] args) {
    Scanner sob = new Scanner(System.in);
    System.out.print("enter a number: "); 
    double x=sob.nextDouble();
    System.out.print("enter a number: "); 
    double y=sob.nextDouble();
    int k1=(int)(x*1000);
    int k2=(int)(y*1000);
    if(k1==k2){
      System.out.println("Yes the numbers are same upto three decimals");
    }
    else{
      System.out.println("No the numbers are not same upto three decimals");
    }
    sob.close();
  }
}