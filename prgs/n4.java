//Program that creates a class Account that stores a variable balance. The class has methods to start account , to deposit money,to withdraw money and tell the current balance
import java.util.*;
class Account {
  double balance;
  static Account n = new Account();
  static Scanner s = new Scanner(System.in);
  void start_account(){
    balance=0;
    System.out.println("you have started an account");
    n.current_amount();
  }
  
  void deposit_money() {
    System.out.println("Enter amount to be deposited: ");
    balance+=s.nextDouble();
    System.out.println("Amount deposited");
  }

  void withdraw_money() {
    System.out.println("Enter amount to be withdrawn: ");
    double k=s.nextDouble();
    if(balance<k){
      System.out.println("Insufficient balance");
    }else{
      balance-=k;
      System.out.println("Amount withdrawn");
    }
  }

  void current_amount() {
    System.out.println("your current balance is:\n" + balance);
  }

  public static void main(String args[]) {
    n.start_account();
    System.out.print("you can:\n(1)>>>Deposit Money\n(2)>>>Withdraw Money\n(3)>>>Check Balance\n(4)>>>Exit\n");
    while (true) {
      int x=s.nextInt();
      if (x==1){
        n.deposit_money();
      }else if (x==2){
        n.withdraw_money();
      }else if (x==3){
        n.current_amount();
      }else if (x==4){
          break;
      }else{
        System.out.print("Wrong input , try again (1/2/3/4)");
      }
    }
    s.close();
  }
}