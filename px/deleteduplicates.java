//Program to delete duplicate elements from an array of size 5.
import java.util.*;
class dd{
  public static void main(String o[]){
    Scanner s = new Scanner(System.in);
    int n=5;
    System.out.print("Enter the "+n+" elements: ");
    int[] a= new int[n];
    for(int i=0;i<n;i++){
      a[i]=s.nextInt();
    }
    int[] b= new int[n];int c=0;
    for(int i=0;i<n;i++){
      int k=0;
      for(int j=0;j<i;j++){
        if(a[i]==b[j]){k++;}
      }
      if(k==0){b[c]=a[i];c++;}
    }
    a=new int[c];//
    for(int i=0;i<c;i++){
      a[i]=b[i];
    }
    System.out.println("new array: ");
    for(int i : a){
      System.out.println(i);
    }
  }
}