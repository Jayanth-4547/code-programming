import java.util.*;//(10 marks)
class rt1{
  int x;
  int y;
  rt1(int x, int y){
    this.x=x;
    this.y=y;
  }
  void show(){
    System.out.print("Sum is: "+(x+y));
  }
  public static void main(String args[]){
    rt1 r = new rt1(10,20);
    r.show();
  }
}