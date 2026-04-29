import java.util.*;//(10 marks)
class rt2{
  int x,y;
  rt2(int a, int b){
    this.x=a;
    this.y=b;
  }
  void show(int x){
    // without 'this' object
    System.out.print("Sum is: "+(x+y));
    // with 'this' object
    System.out.print("Sum is: "+(this.x+y));
  }
  public static void main(String args[]){
    rt2 r = new rt2(10,20);
    r.show(100);
  }
}