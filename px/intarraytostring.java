//Convert a given integer array of Size “N” into string.
import java.util.*;
class ias{
  public static void main(String o[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter no. of elements: ");
    int n=s.nextInt();String r="";
    int[] u=new int[n];
    System.out.println("Enter "+n+" elements: ");
    for(int i=0;i<n;i++){
      u[i]=s.nextInt();
      r=r+u[i]+" ";
    }
    System.out.println("String: "+r);
  }
}