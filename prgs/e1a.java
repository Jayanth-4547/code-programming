import java.util.Scanner;

class BankAccount {
  String accountNumber;
  String accountHolderName;
  double balance;

  void readDetails() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter account number: ");
    accountNumber = input.nextLine();
    System.out.println("Enter account holder's name: ");
    accountHolderName = input.nextLine();
    System.out.println("Enter balance: ");
    balance = input.nextDouble();
  }

  void printDetails() {
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Account Holder's Name: " + accountHolderName);
    System.out.println("Balance: " + balance);
  }

  public static void main(String[] args) {
    BankAccount account = new BankAccount();
    account.readDetails();
    account.printDetails();
  }
}