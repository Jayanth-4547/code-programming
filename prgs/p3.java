import java.util.*;
class M3{
  public static void main(String[] args) {
    Scanner sob = new Scanner(System.in);
    System.out.print("enter a number: "); 
    int x=sob.nextInt();
    System.out.print("enter a number: "); 
    int y=sob.nextInt();
    System.out.print("enter a number: "); 
    int z=sob.nextInt();
    int k=(x>y)?((x>z)?x:z):((y>z)?y:z);
    System.out.println("The greatest number is: "+k);
    sob.close();
  }
}