import java.util.*;
class q1{
  public static void main(String x[]){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter row size: ");
    int r=s.nextInt();
    System.out.print("Enter column size: ");
    int c=s.nextInt();
    int a[][] = new int[r][c];
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        System.out.print("Enter value at ["+i+","+j+"] : ");
        a[i][j]=s.nextInt();
      }
    }
    System.out.println("Transpose of the given matrix is: ");
    for(int i=0;i<c;i++){
      for(int j=0;j<r;j++){
        System.out.print(a[j][i]+"  ");
      }
      System.out.println(" ");
    }
  }
}