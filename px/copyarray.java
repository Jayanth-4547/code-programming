import java.util.*;
class ca{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the array size");
    int n= s.nextInt();
    int[] a=new int[n];
    for (int j=0;j<n;j++){
      System.out.print("Enter an element : ");
      a[j]=s.nextInt();
    }
    int[] b=new int[a.length];
    for(int i=0;i<a.length;i++){
      b[i]=a[i];
    }
    System.out.println("copied array: ");
    for(int i : b){
      System.out.println(i);
    }
  }
}