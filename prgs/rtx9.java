import java.util.*;
class rtx9{
  public static void main(String x[]){
    Scanner s=new Scanner(System.in);
    int a[],avg=0;
    System.out.print("Enter number of elements: ");
    int n=s.nextInt();
    a=new int[n];
    for(int i=0;i<n;i++){
      System.out.print("Enter a number: ");
      a[i]=s.nextInt();
      avg+=a[i];
    }
    avg/=n;
    System.out.println("Average: "+avg);
    System.out.print("Elements Below Average: ");
    for(int i=0;i<n;i++){
      if(a[i]<avg){
        System.out.print(a[i]+" ");
      }
    }
    System.out.println("");
    System.out.print("Elements Above or Equal to Average: ");
    for(int i=0;i<n;i++){
      if(a[i]>=avg){
        System.out.print(a[i]+" ");
      }
    }
    System.out.println("");
  }
}