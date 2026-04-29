import java.util.*;
class atmi{
  int k=0,tk=0;
  int bal[]={0,0,0,0,0};
  String tranHist[]={"","","","",""};
  String uidl[]={"user1","user2","user3","user4","user5"};
  int pinl[]={0001,0002,0003,0004,0005};
  Scanner s=new Scanner(System.in);
  boolean verify(String uid,int pin){
    for(int i=0;i<uidl.length;i++){
      if(uidl[i].equals(uid) && pinl[i]==pin){
        k=i;
        return true;
      }
    }
    return false;
  }
  boolean verify(String uid){
    for(int i=0;i<uidl.length;i++){
      if(uidl[i].equals(uid)){
        tk=i;
        return true;
      }
    }
    return false;
  }
  void TransHistory(){
      String thk=tranHist[k];
      String[] history = thk.split("#");
      for (String transaction : history) {
          System.out.println(transaction);
      }
  }
  void Withdraw(){
    System.out.print("Enter the amount to be withdrawn: ");
    int wd=s.nextInt();
    if((bal[k]-wd)>=0){
      bal[k]-=wd;
      tranHist[k]=tranHist[k]+"#Amount of "+wd+" is withdrawn by "+uidl[k];
      System.out.println("Your amount is withdrawn successfully!");
    }else{
      System.out.println("withdraw failed! Insufficient funds.");
      tranHist[k]=tranHist[k]+"#Withdraw of Amount "+wd+" by "+uidl[k]+" Failed";
    }
  }
  void Deposit(){
    System.out.print("Enter the amount to be deposited: ");
    int dep=s.nextInt();
    bal[k]+=dep;
    tranHist[k]=tranHist[k]+"#Amount of "+dep+" is deposited by "+uidl[k];
    System.out.println("Your amount is deposited successfully!");
  }
  void Transfer(){
    System.out.print("Enter the UserId to whom you want to transfer: ");
    String tuid=s.next();
    if(verify(tuid)){
      System.out.print("Enter the amount to be transfered: ");
      int tran = s.nextInt();
      s.nextLine();
      if((bal[k]-tran)>=0){
        bal[k]-=tran;
        bal[tk]+=tran;
        tranHist[tk]=tranHist[tk]+"#Amount of "+tran+" is transfered by "+uidl[k];
        tranHist[k]=tranHist[k]+"#Amount of "+tran+" is transfered to "+uidl[tk];
        System.out.println("Your amount is transfered successfully!");
      }else{
        System.out.println("Your transaction failed! Insufficient funds.");
        tranHist[k]=tranHist[k]+"#Transfer of Amount "+tran+" to "+uidl[tk]+" Failed";
      }
    }else{System.out.println("Invalid UserId. Try Again.");}
  }
  public static void main(String o[]){
    atmi atm=new atmi();
    System.out.println("Welcome to the ATM");
    while(true){
      System.out.print("Enter UserID: ");
      String uid = atm.s.next();
      System.out.print("Enter pin: ");
      int pin = atm.s.nextInt();
      atm.s.nextLine();
      if(atm.verify(uid,pin)){
        while(true){
          System.out.println("(1)>>Transactions History\n(2)>>Withdraw\n(3)>>Deposit\n(4)>>Transfer\n(5)>>Quit\nEnter your choice[1/2/3/4/5]: ");
          int n=atm.s.nextInt();
          if(n==1){
            atm.TransHistory();
          }
          else if(n==2){
            atm.Withdraw();
          }
          else if(n==3){
            atm.Deposit();
          }
          else if(n==4){
            atm.Transfer();
          }
          else if(n==5){
            break;
          }else{System.out.println("Invalid Input. Try Again");}
        }
      }else{System.out.println("Invalid Credentials. Try Again");}
      System.out.println("Enter 0 to exit atm else enter 1");
      if(atm.s.nextInt()==0){break;}
    }
    System.out.println("Thank You");
  }
}