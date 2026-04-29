import java.util.*;
class cs{
  public static void main(String o[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the string : ");
    String t=s.nextLine();
    String n=""; int l=10;
    t=t.substring(0,l);
    String[] g=t.split(" ");
    for(String m : g){
        if((n.length()+m.length())<l){
            n+=m+" ";
        }
    }
    System.out.print("Enter the width : ");
    int w=s.nextInt();
    String[] y=t.split(" ");
    String z="";
    for(String x : y){
      if(((z.length()+x.length())>w)&&z!=""){
        System.out.println(z);
        z="";
      }
      if(x.length()>=w){
        System.out.println(x);
      }else{
        z=z+x+" ";
      }
    }
    System.out.println(z.trim());
  }
}