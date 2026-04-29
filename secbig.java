import java.util.*;
import static sb.second;

class SB {
  public static void main(String o[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number of elements: ");
    int n = s.nextInt();
    if (n > 1) {
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        System.out.println("Enter number: ");
        a[i] = s.nextInt();
      }
      int k = second.biggest(a);
      System.out.println("Second biggest is: " + k);
    } else {
      System.out.println("u need more than one number");
    }
  }
}