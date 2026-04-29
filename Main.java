// // import static org.junit.jupiter.api.Assertions.assertEquals;

// // import org.junit.jupiter.api.Test;

// class Main {
//   public static void main(String[] args) {
//     System.out.println("Hello world!");
//   }

//   // @Test
//   // void addition() {
//   //     assertEquals(2, 1 + 1);
//   // }
// }
//Convert a given integer array of Size “N” into string.
import java.util.*;
class ex10
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter array size: ");
      int n=s.nextInt();
      int a[]= new int[n];
      System.out.println("Enter "+n+" elements: ");
      for(int i=0;i<n;i++)
        {
          a[i]=s.nextInt();
        }
      String str=Arrays.toString(a);
      System.out.println("Array as String: "+str);
    }
  }