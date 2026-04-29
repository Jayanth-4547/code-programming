//how to pass the variable length arguments in java, illustrate with an example program.
import java.util.*;
public class n7{
  static int op(int ... b){
    int c=0;
    for(int i=0;i<b.length;i++){
      c+=b[i];
    }
    return c;
  }
  public static void main(String x[]) {
    int[] y=new int[x.length];
    for(int i=0; i<x.length;i++){
      y[i]=Integer.parseInt(x[i]);
    }
    System.out.println("sum = "+n7.op(y));
  }
}