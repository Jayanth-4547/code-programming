import java.util.*;
class M10{
  public static void main(String[] args) {
    Scanner sob = new Scanner(System.in);
    System.out.print("enter a number: "); 
    int x=sob.nextInt();
    if(x>0){
      System.out.println("the right angle triangle pattern for "+x+" is:");
      for(int i=1;i<=x;i++){
        for(int j=1;j<=i;j++){
          System.out.print(j);
        }
        System.out.print("\n");
      }
    }
    else{
      System.out.print("Invalid Input -- pattern is not generated");
    }
    sob.close();
  }
}