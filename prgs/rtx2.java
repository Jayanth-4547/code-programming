class rtx2{
  int a;
  rtx2(){}
  rtx2(int a){
    this.a=a;
  }
  public static void main(String args[]){
    rtx2 ob1 = new rtx2(10);
    rtx2 ob2 = new rtx2(20);
    rtx2 ob3 = new rtx2();
    ob3 = ob1.sum(ob2);
    ob3.show();
  }
  rtx2 sum(rtx2 y){
    rtx2 z = new rtx2();
    z.a = a + y.a ;
    return z;
  }
  void show(){
    System.out.println("Sum of two object value is "+a);
  }
}