package sb;

import java.util.*;

public class second {
  public int biggest(int a[]) {
    Arrays.sort(a);
    return a[a.length - 2];
  }
}