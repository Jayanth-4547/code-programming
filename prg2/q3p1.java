import java.util.*;
class rev{
  public static void main(String x[]){
    Scanner s=new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    System.out.print("Enter no.of strings:");
    int n=s.nextInt();
    for(int i=0;i<n;i++){
      System.out.print("Enter a string:");
      sb.append(s.nextLine()+"#");
    }
    System.out.println(sb);
    String k=sb.reverse().toString();
    String [] y = k.split("#");
    for(int i=n;i>0;i--){
      System.out.println(y[i]);
    }
  }
}