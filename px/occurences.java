//Program to count the number of occurrences of a search string in a given text string.
import java.util.*;
class oc{
  public static void main(String o[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a String: ");
    String t=s.nextLine();
    System.out.println("Enter Search String: ");
    String n=s.nextLine();
    int oc=0;
    while(true){
      int k=t.indexOf(n);
      if(k==-1){
        break;
      }
      t=t.substring(k+n.length());
      oc++;
    }
    System.out.println("Occurences: "+oc);
  }
}