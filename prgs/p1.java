import java.util.*;
class M1{
  public static void main(String[] args) {
    System.out.print("enter a number: "); 
    Scanner sob = new Scanner(System.in);
    int x=sob.nextInt();
    if(x<0){
      System.out.println(x+" is negative");
    }
    else if(x>0){
      System.out.println(x+" is positive");
    }
    else{
      System.out.println(x+" is neither positive nor negative");
    }
  }
}