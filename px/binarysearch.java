import java.util.*;
class bs{
  boolean binsearch(int a[],int start,int end, int k){
    if(start<=end){
      int i=start+((end-start)/2);
      if(a[i]==k){
        return true;
      }
      else if(a[i]>k){
        return binsearch(a,start,i-1,k);
      }
      else{
        return binsearch(a,i+1,end,k);
      }
    }
    return false;
  }
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
    bs b=new bs();
    if(b.binsearch(a,0,a.length-1,k)){
      System.out.println("Element Found");    
    }else{System.out.println("Element not found");}
  }
}