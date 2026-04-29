import java.util.*;
class op{
  void add(int a,int b){
    int c;
    c=a+b;
    System.out.print("Addition of a & b is "+c);
  }

  public static void main(String args[]){
    op z=new op();
    Scanner s=new Scanner(System.in);
    int x,y;
    System.out.println("Enter values to a & b: ");
    x=s.nextInt();
    y=s.nextInt();
    z.add(x,y);
  }

}