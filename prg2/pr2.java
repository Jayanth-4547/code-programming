class Base{
  int a=10;
  void show(){
    a++;
    System.out.println("This is base class show fun "+a);
  }
}
class Derived extends Base{
  void show(){
    super.show();
    a++;
    System.out.println("This is derived class show fun "+a);
  }
  public static void main(String args[]){
    Derived D=new Derived();
    D.show();
    Base B = new Base();
    B=D;
    B.show();
    B=new Derived();
    B.show();
  }
}