import java.util.*;
class rtx7{
  public static void main(String x[]){
    Scanner s=new Scanner(System.in);
    int a[],e=0,o=0;
    System.out.print("Enter number of elements: ");
    int n=s.nextInt();
    a=new int[n];
    for(int i=0;i<n;i++){
      System.out.print("Enter a number: ");
      a[i]=s.nextInt();
      if(a[i]%2==0){
        e+=1;
      }else{
        o+=1;
      }
    }
    System.out.println("Count of Even numbers: "+e);
    System.out.println("Count of Odd numbers: "+o);
  }
}