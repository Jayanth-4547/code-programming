import java.util.*;
class ja{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the array size: ");
    int n= s.nextInt();
    int[][] a=new int[n][];
    for (int j=0;j<n;j++){
      System.out.println("Enter size of "+(j+1)+"th array : ");
      int k=s.nextInt();
      a[j]=new int[k];
      System.out.println("Enter "+k+" Values: ");
      for (int q=0;q<k;q++){
        a[j][q]=s.nextInt();
      }
    }
    System.out.println("Given "+n+" arrays are: ");
    for(int[] i : a){
      for(int j : i){
        System.out.print(j+" ");
      }
      System.out.print("\n");
    }
  }
}