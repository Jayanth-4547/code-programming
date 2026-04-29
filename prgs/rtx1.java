class rtx1{
  int a,b;
  public static void main(String args[]){
    rtx1 r1=new rtx1();
    rtx1 r2=new rtx1();
    r1.a=10;
    r1.b=20;
    r2.copy(r1);
    r2.show();
  }
  void copy(rtx1 r3){
    this.a=r3.a;
    this.b=r3.b;
  }
  void show(){
    System.out.println("a = "+a);
    System.out.println("b = "+b);
    System.out.println("Sum is "+(a+b));
  }
}