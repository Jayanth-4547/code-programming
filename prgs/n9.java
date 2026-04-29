//read cmd line arguments and print total no. of arguments and is values
class n9{
  public static void main(String x[]) {
    System.out.println("Total no.of arguments: "+x.length);
    System.out.println("the values are: ");
    for(int i=0;i<x.length;i++){
      System.out.print(x[i]+"\n");
    }
  }
}