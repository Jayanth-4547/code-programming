import java.util.*;
class M6{
  public static void main(String[] args) {
    Scanner sob = new Scanner(System.in);
    System.out.print("enter a year: "); 
    int x=sob.nextInt();
    if(x%400==0){
      System.out.print("It is a leap year!");
    }
    else if(x%100==0){
      System.out.print("It is not a leap year..");
    }
    else if(x%4==0){
      System.out.print("It is a leap year!");
    }
    else{
      System.out.print("It is not a leap year..");
    }
    sob.close();
  }
}