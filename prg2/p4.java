import java.util.*;
class p4{
  public static void main(String x[]){
    Scanner s=new Scanner(System.in);
    String a,b;
    System.out.print("Enter a string: ");
    a=s.nextLine();
    StringBuffer sb1=new StringBuffer(a);
    System.out.print("Enter a string: ");
    b=s.nextLine();
    StringBuffer sb2=new StringBuffer(b);
    int k=sb1.toString().indexOf(sb2.toString());
    if(sb1.compareTo(sb2)==0){
      System.out.print("Same");
    }
    else if(k!=-1){
        sb1.delete(k,k+sb2.length());
        System.out.print("new string: "+sb1);
    }
    else{
        System.out.println("Length of string1: "+sb1.length());
        System.out.println("Length of string2: "+sb2.length());
        if(sb1.length()>sb2.length()){
          System.out.println("Length of string1 is greater");
        }
        else if(sb1.length()==sb2.length()){
          System.out.println("Length of both strings are same");
        }
        else{
          System.out.println("Length of string2 is greater");
        }
    }
    
  }
}