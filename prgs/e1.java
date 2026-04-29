import java.util.*;
class bad{
  long a,d;
  String b,c,e,f;
  void read(){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter accno: ");
    a=s.nextLong();
    s.nextLine();
    System.out.print("Enter branch_name: ");
    b=s.nextLine();
    System.out.print("Enter acc_type: ");
    c=s.nextLine();
    System.out.print("Enter cell_no: ");
    d=s.nextLong();
    s.nextLine();
    System.out.print("Enter customer_name: ");
    e=s.nextLine();
    System.out.print("Enter branch_addrss: ");
    f=s.nextLine();
  }
  void show(){
    System.out.println("accno: "+a);
    System.out.println("branch_name: "+b);
    System.out.println("acc_type: "+c);
    System.out.println("cell_no: "+d);
    System.out.println("customer_name: "+e);
    System.out.println("branch_addrss: "+f);
  }
  public static void main(String args[]){
    bad x=new bad();
    System.out.println("/////Enter bank details///// ");
    x.read();
    System.out.println("/////Your bank details///// ");
    x.show();
  }
}