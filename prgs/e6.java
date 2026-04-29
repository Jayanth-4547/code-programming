import java.util.*;
class x2{
  int j;
  public x2(int h){
    j=h;
  }
  String pal(){
    int k=0,g=0,t1=j,x=j;
    while(t1!=0){
      t1/=10;
      k++;
    }
    for(int n=0;n<(k/2);n++){
      g+=x%10;
      x/=10;
      g*=10;
    }
    g/=10;
    if(k%2==1){
      x/=10;
    }
    if(g!=x){
      return " not";
    }
    return "";
  }
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int a=s.nextInt();
    x2 r = new x2(a);
    System.out.print("yes "+a+" is"+r.pal()+" a palindrome");
  }
}