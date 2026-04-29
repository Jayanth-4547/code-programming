//Read and Display Bank details using BufferedReader
import java.io.*;
class rt5{
  public static void main(String args[])throws IOException{
    String bn,brn,at,dob,gen,adr;
    int ab,age;
    long an,mbn;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("/////Enter bank details///// ");
    
    System.out.print("Enter Bank Name: ");
    bn=br.readLine();
    System.out.print("Enter Branch Name: ");
    brn=br.readLine();
    System.out.print("Enter Account no: ");
    an=Long.parseLong(br.readLine());
    System.out.print("Enter Account type: ");
    at=br.readLine();
    System.out.print("Enter Account balance: ");
    ab=Integer.parseInt(br.readLine());
    System.out.print("Enter Mobile no: ");
    mbn=Long.parseLong(br.readLine());
    System.out.print("Enter DOB(YYYY-MM-DD): ");
    dob=br.readLine();
    System.out.print("Enter Age: ");
    age=Integer.parseInt(br.readLine());
    System.out.print("Enter Gender(M/F): ");
    gen=br.readLine().charAt(0)+"";
    System.out.print("Enter Address: ");
    adr=br.readLine();

    System.out.println("/////Your bank details///// ");
    
    System.out.println("Bank Name: "+bn);
    System.out.println("Branch Name: "+brn);
    System.out.println("Account no: "+an);
    System.out.println("Account type: "+at);
    System.out.println("Account balance: "+ab);
    System.out.println("Mobile no: "+mbn);
    System.out.println("DOB(YYYY-MM-DD): "+dob);
    System.out.println("Age: "+age);
    System.out.println("Gender(M/F): "+gen);
    System.out.println("Address: "+adr);
  }
}