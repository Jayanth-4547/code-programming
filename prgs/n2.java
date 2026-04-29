import java.util.*;
class n2{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter a character: ");
    char x=s.next().charAt(0);
    System.out.print("Enter a character: ");
    char y=s.next().charAt(0);
    System.out.println("Addition[+2]: "+(char)(x+2));
    System.out.println("Subtraction[-1]: "+(char)(y-1));
  }
}