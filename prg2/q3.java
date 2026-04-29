import java.util.*;
class q3{
  public static void main(String x[]){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter matrix 1 row size : ");
    int r1=s.nextInt();
    System.out.print("Enter matrix 1 column size : ");
    int c1=s.nextInt();
    System.out.print("Enter matrix 2 row size : ");
    int r2=s.nextInt();
    System.out.print("Enter matrix 2 column size : ");
    int c2=s.nextInt();
    if(c1==r2){
      int a1[][]=new int[r1][c1];
      int a2[][]=new int[r2][c2];
      for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
          System.out.print("Enter matrix 1 value at ["+i+","+j+"] : ");
          a1[i][j]=s.nextInt();
        }
      }
      for(int i=0;i<r2;i++){
        for(int j=0;j<c2;j++){
          System.out.print("Enter matrix 2 value at ["+i+","+j+"] : ");
          a2[i][j]=s.nextInt();
        }
      }
      System.out.println("Multiplication of the matrices is:");
      for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
          int k=0;
          for(int m=0;m<r2;m++){
            k+=a1[i][m]*a2[m][j];
          }
          System.out.print(k+"  ");
        }
        System.out.println(" ");
      }
    }else{
      System.out.println("Matrix Multiplication is not possible.\nNumber of Coloumns in matrix 1 and Number of rows in matrix 2 must be same!");
    }
  }
}