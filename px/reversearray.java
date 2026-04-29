//Program that reverses an array and stores it in the same array.
import java.util.*;
class ra {
  public static void main(String o[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter no. of elements: ");
    int n = s.nextInt();
    System.out.print("Enter the " + n + " elements: ");
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = s.nextInt();
    }
    for (int i = 0; i < n/2; i++) {
        int temp=a[i];
        a[i]=a[n-1-i];
        a[n-1-i]=temp;
    }
    System.out.println("reversed array: ");
    for (int i : a) {
      System.out.println(i);
    }
  }
}