import java.util.*;
class p5{
  public static void main(String x[]){
    Scanner s=new Scanner(System.in);
    StringBuffer sb1=new StringBuffer("");
    int n,k=0;
    String a,b,c;
    System.out.print("Enter a no. of strings: ");
    n=s.nextInt();
    s.nextLine();
    for(int i=0;i<n;i++){
      System.out.print("Enter a string: ");
      String ss=nextLine();
      sb1.append(ss+"#");
      if(ss.length()>k){
        k=ss.length();
        c=ss;
      }
    }
    int d=k;
    String[] parts = sb1.toString().split("#");
    String[] sorted=new String(n);
    for(int i=0;i<n;i++){
      for(String part:parts){
        if(part.length<c.length){
          c=part;
        }
      }
      sorted[i]=c;
      String[] parts=parts.remove(c);
    }
  }
}