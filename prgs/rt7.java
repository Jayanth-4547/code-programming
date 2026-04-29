//Read subject marks and Display grades using BufferedReader
import java.io.*;
class rt7{
  public static void main(String args[])throws IOException{
    char ch;
    String str,name;
    int rno;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter Gender(M/F): ");
    ch=br.readLine().charAt(0)+"";
    System.out.println("Enter ur Name: ");
    name=br.readLine();
    System.out.print("Enter ur rno: ");
    rno=Integer.parseInt(br.readLine());
    System.out.println("Ur Name is: "+name);
    System.out.println("Ur rno is: "+rno);
    System.out.println("Gender is: "+ch);
  }
}