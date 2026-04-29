import java.util.*;
class x1{
  int fact(int x){
    int k=1;
    if(x==0){
      return 1;
    }
    for(int y=x;y!=1;y--){
      k*=y;
    }
    return k;
  }
  public static void main(String args[]){
    x1 r = new x1();
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int a=s.nextInt();
    int z=r.fact(a);
    System.out.print("factorial of the number "+a+" is: "+z);
  }
}