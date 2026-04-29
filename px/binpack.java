import java.util.*;
class bis{
  public static void main(String o[]){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the no. of elements: ");
    int n = s.nextInt();
    int[] a= new int[n];
    for(int i=0;i<n;i++){
      System.out.print("Enter an element: ");
      a[i]=s.nextInt();
    }
    Arrays.sort(a);
    System.out.print("Enter the element you want to search: ");
    int k=s.nextInt();
    int b=Arrays.binarySearch(a, k);
    if(b<0){
      System.out.println("Element not found");
    }else{System.out.println("Element Found at index "+b);}
  }
}