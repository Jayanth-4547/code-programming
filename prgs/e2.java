import java.util.*;
class val{
  int a;
  String eod(){
    if(a%2==0){
      return "even";
    }
    else{
      return "odd";
    }
  }
  String pon(){ 
    if(a>=0){
      return "positive";
    }
    else{
      return "negative";
    }
  }
  public static void main(String args[]){
    val x=new val();
    System.out.println("///Enter a number: ");
    Scanner s=new Scanner(System.in);
    x.a=s.nextInt();
    System.out.println("it is "+x.eod()+" and "+x.pon());
  }
}