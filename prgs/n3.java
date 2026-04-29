import java.util.*;
class n3{
  void compare(int x,int y){
    System.out.println("Greatest Integer [ "+x+" & "+y+" ] is: "+(x>y?x:(x<y?y:"None, Both are Same")));
  }
  void compare(char x,char y){
    System.out.println("Greatest Character [ "+x+" & "+y+" ] is: "+(x>y?x:(x<y?y:"None, Both are Same")));
  }
  void compare(String x,String y){
    int k=x.compareTo(y);
    System.out.println("Greatest String [ "+x+" & "+y+" ] is: "+(k>0?x:(k<0?y:"None, Both are Same")));
  }
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    n3 n = new n3();
    System.out.print("Enter an integer: ");
    int x=s.nextInt();
    System.out.print("Enter an integer: ");
    int y=s.nextInt();
    n.compare(x,y);
    System.out.print("Enter a character: ");
    char xx=s.next().charAt(0);
    System.out.print("Enter a character: ");
    char yy=s.next().charAt(0);
    n.compare(xx,yy);
    System.out.print("Enter a String: ");
    s.nextLine();
    String xxx=s.nextLine();
    System.out.print("Enter a String: ");
    String yyy=s.nextLine();
    n.compare(xxx,yyy);
  }
}
