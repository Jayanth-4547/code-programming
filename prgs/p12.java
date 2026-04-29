import java.util.*;
class hmmm{
  String n;
  char g;
  int a;
  public static void main(String args[]){
    Scanner S= new Scanner(System.in);
    hmmm hmm= new hmmm();
    System.out.println("Enter you name: ");
    hmm.n=S.nextLine();
    System.out.println("Enter you gender(M/F): ");
    hmm.g=S.next().charAt(0);
    System.out.println("Enter you age: ");
    hmm.a=S.nextInt();
    String k;
    if(hmm.g=='M'||hmm.g=='m'){
      if(hmm.a<21){
        k="boy";
      }
      else{
        k="man";
      }
    }
    else if(hmm.g=='F'||hmm.g=='f'){
      if(hmm.a<21){
        k="girl";
      }
      else{
        k="woman";
      }
    }
    else{
      k="Invalid";
    }
    if(hmm.a<0){
      k="Invalid";
    }
    System.out.println(hmm.n+" is a "+k);
  }
}