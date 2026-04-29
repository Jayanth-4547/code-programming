import java.util.*;
class M8{
  public static void main(String[] args) {
    Scanner sob = new Scanner(System.in);
    System.out.print("enter a number: "); 
    int v=sob.nextInt();
    System.out.print("enter a number: "); 
    int w=sob.nextInt();
    System.out.print("enter a number: "); 
    int x=sob.nextInt();
    System.out.print("enter a number: "); 
    int y=sob.nextInt();
    System.out.print("enter a number: "); 
    int z=sob.nextInt();
    int k=v+w+x+y+z;
    double f=((double)k)/5;
    System.out.println("The Sum is: "+k);
    System.out.println("The Average is: "+f);
    sob.close();
  }
}