import java.util.*;
class e3{
  int gcd(int x,int y){
    int i=(x<y?x:y),k=1;
    while(i>=2){
      if((x%i==0&&y%i==0)){
        k=i;
        return k;
      }
      i--;
    }
    return 1;
  }
  public static void main(String args[]){
    e3 z = new e3();
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int a=s.nextInt();
    System.out.println("Enter another number: ");
    int b=s.nextInt();
    int d=z.gcd(a,b);
    System.out.println("GCD is: "+d);
  }
}