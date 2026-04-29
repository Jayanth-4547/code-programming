import java.util.*;
class M9{
  public static void main(String[] args) {
    Scanner sob = new Scanner(System.in);
    System.out.print("enter a number: "); 
    int x=sob.nextInt();
    System.out.println("the multiplication table for "+x+" is:\n");
    for(int i=1;i<=10;i++){
      int k=x*i;
      System.out.println(x+" X "+i+" = "+k+"\n");
    }
    sob.close();
  }
}