//Program for sorting a given list of names in ascending order.
import java.util.*;
class an{
  public static void main(String o[]){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter no. of names: ");
    int n=s.nextInt();
    s.nextLine();
    String[] a=new String[n];
    for(int i=0;i<n;i++){
      System.out.print("Enter a name: ");
      a[i]=s.nextLine();
    }
    Arrays.sort(a);
    System.out.println("Sorted names: ");
    for(int i=0;i<n;i++){
      System.out.println(a[i]);
    }
  }
}