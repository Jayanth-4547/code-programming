import java.util.*;
class rtx5{
  public static void main(String args[]){
    int a[];
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the array size");
    int n= s.nextInt();
    a=new int[n];
    System.out.println("Enter "+n+" Values: ");
    for (int j=0;j<n;j++)
      a[j]=s.nextInt();
    System.out.println("Given "+n+" values are: ");
    for(int i:a)
      System.out.print(i+" ");
  }
}