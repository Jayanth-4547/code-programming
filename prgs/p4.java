import java.util.*;
class M4{
  public static void main(String[] args) {
    Scanner sob = new Scanner(System.in);
    System.out.print("enter a number: "); 
    int x=sob.nextInt();
    int k=x%7;
    if(k<0){
      k+=7;
    }
    System.out.println("Generated Number: "+k);
    String[] S={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    System.out.println("The Weekday is: "+S[k]);
    sob.close();
  }
}