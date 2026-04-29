import java.io.*;
class rt9{
  public static void main(String X[]){
    int k=Integer.parseInt(X[0]);
    int l=Integer.parseInt(X[1]);
    int m=Integer.parseInt(X[2]);
    int n=(k>l)?((k>m)?k:m):((l>m)?l:m);
    System.out.println("Greatest number is: "+n);
  }
}