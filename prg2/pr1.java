interface Base{
  int a=10;
  void show();
}
class Derived implements Base{
  public void show()
  {
    System.out.println("This is derived class show fun "+a);
  }
  public static void main(String args[]){
    Derived D=new Derived();
    D.show();
    System.out.println("This s main fun "+a);
    System.out.println("This is main fun "+D.a);
    System.out.println("This is main fun "+Base.a);
  }
}