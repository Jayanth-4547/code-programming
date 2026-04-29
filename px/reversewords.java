//Program to reverse the words in a string.
import java.util.*;
class rw {
  public static void main(String o[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a String: ");
    String st=s.nextLine();
    String[] sta=st.split(" ");
    String r="";
    for (String i : sta){
      String t="";
      while(i.length()>0){
        t=t+i.charAt(i.length()-1);
        i=i.substring(0,i.length()-1);
      }
      r=r+t+" ";
    }
    System.out.println("reversed words array: ");
    r=r.trim();
    System.out.println(r);
  }
}