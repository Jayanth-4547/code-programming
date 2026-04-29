import java.util.*;
class rtx8{
  public static void main(String x[]){
    Scanner s=new Scanner(System.in);
    int a[],k=0;
    System.out.print("Enter number of elements: ");
    int n=s.nextInt();
    a=new int[n];
    for(int i=0;i<n;i++){
      System.out.print("Enter a number: ");
      a[i]=s.nextInt();
    }
    System.out.print("Enter last digit: ");
    int d=s.nextInt();
    for(int i=0;i<n;i++){
      if(a[i]%10==d){
        System.out.println(a[i]); k+=1;
      }
    }
    if(k==0){System.out.print("Not Found");}
  }
}