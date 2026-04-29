import java.util.*;
class rtx6{
  public static void main(String args[]){
    int a[],b,c,d;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the array size: ");
    M=s.nextInt();
    a=new int[M];
    if(b>0){
      System.out.print("Enter a value: ");
      a[0]=s.nextInt();
      c=a[0];
      d=a[0];
      for(int i=1;i<b;i++){
        System.out.print("Enter a value: ");
        a[i]=s.nextInt();
        if(a[i]>c){
          c=a[i];
        }
        if(a[i]<d){
          d=a[i];
        }
      }
      System.out.println("Biggest value is: "+c);
      System.out.println("Smallest value is: "+d);
    }
  }
}