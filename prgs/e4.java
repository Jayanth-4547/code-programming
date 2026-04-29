import java.util.*;
class e4{
  int sm(int x,int y,int z){
    int k=x>y?(x<z?x:z):(y<z?y:z);
    return k;
  }
  public static void main(String args[]){
    e4 r = new e4();
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int a=s.nextInt();
    System.out.println("Enter another number: ");
    int b=s.nextInt();
    System.out.println("Enter one more number: ");
    int c=s.nextInt();
    int d=r.sm(a,b,c);
    System.out.println("the second smallest number is: "+d);
  }
}