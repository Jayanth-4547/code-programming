//Program to implement a book class that stores the details of a book such as its code, title and price (Use constructors to initialize the objects)
//book: code,title,price
import java.util.*;
class Book {
  int code;
  String title;
  double price;
  Book(int x, String y, double z){
    code=x;
    title=y;
    price=z;
  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter book's code: ");
    int p=s.nextInt();
    s.nextLine();
    System.out.print("Enter book's title: ");
    String q=s.nextLine();
    System.out.print("Enter book's price: ");
    double r=s.nextDouble();
    Book b = new Book(p,q,r);
    System.out.println("Details are stored");
    System.out.println("Book details are:\ncode: "+b.code+"\ntitle: "+b.title+"\nprice: "+b.price);
    s.close();
  }
}