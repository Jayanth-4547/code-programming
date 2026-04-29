//Read subject marks and Display grades using BufferedReader
import java.io.*;
class rt6{
  public static void main(String args[])throws IOException{
    String s1,s2,s3,s4,s5,k="",l="",m="",n="",o="";
    int a,b,c,d,e,i=0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("/////Enter Subject Marks///// ");

    System.out.print("Enter Subject Name: ");
    s1=br.readLine();
    System.out.print("Enter Marks: ");
    a=Integer.parseInt(br.readLine());
    System.out.print("Enter Subject Name: ");
    s2=br.readLine();
    System.out.print("Enter Marks: ");
    b=Integer.parseInt(br.readLine());
    System.out.print("Enter Subject Name: ");
    s3=br.readLine();
    System.out.print("Enter Marks: ");
    c=Integer.parseInt(br.readLine());
    System.out.print("Enter Subject Name: ");
    s4=br.readLine();
    System.out.print("Enter Marks: ");
    d=Integer.parseInt(br.readLine());
    System.out.print("Enter Subject Name: ");
    s5=br.readLine();
    System.out.print("Enter Marks: ");
    e=Integer.parseInt(br.readLine());
    //////////////////
    String[] g={"F [Failed]","F [Failed]","E [Failed]","D [Failed]","P","C","B","B+","A","A+","O"}, ag={k,l,m,n,o};
    int[] j={a,b,c,d,e};
    while(i<5){
      ag[i]=g[(j[i]/10)];
      i++;
    }
    System.out.println("/////Your Grade details///// ");

    System.out.println(s1+" : "+ag[0]);
    System.out.println(s2+" : "+ag[1]);
    System.out.println(s3+" : "+ag[2]);
    System.out.println(s4+" : "+ag[3]);
    System.out.println(s5+" : "+ag[4]);
  }
}