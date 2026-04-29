//Create a class named 'Member' having the following members: Name, Age, Phone number, Address, Salary. It also has a method named 'printSalary' which prints the salary of the members. Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.
import java.util.*;
class Member{
  String Name,Address;
  int Age,Phone_number,Salary;
  void printSalary(){
    System.out.println("Salary is: "+salary);
  }
}
class Employee extends Member{
  String specialization="cs",department="cse"; 
}
class Manager extends Member{
  String specialization="ds",department="cse"; 
}
class test{
  Employee e=new Employee();
  Manager m=new Manager();
  e.
}