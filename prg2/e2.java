import java.util.*;
class e2{
  public static void main(String args[]){
    ArrayList<Integer> num=new ArrayList<Integer>();
    num.add(10);
    num.add(20);
    num.add(30);
    num.add(40);
    num.add(50);
    System.out.println(num);
    System.out.println(num.get(1));
    num.remove(0);
    System.out.println(num);
    num.set(0,100);
    System.out.println(num);
    System.out.println(num);
    System.out.println(num.size());
    num.clear();
    System.out.println(num);
  }
}