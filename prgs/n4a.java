import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class DynamicAccountCreation {

    public static void main(String[] args) {
        try {
            // Get user input for initial balance
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter initial balance: $");
            double initialBalance = scanner.nextDouble();

            // Dynamically create the Account class
            Class<?> accountClass = createAccountClass();

            // Create an instance of the dynamically created Account class
            Constructor<?> constructor = accountClass.getDeclaredConstructor(double.class);
            Object accountObject = constructor.newInstance(initialBalance);

            // Invoke methods on the dynamically created instance
            accountClass.getMethod("deposit", double.class).invoke(accountObject, 100.0);
            accountClass.getMethod("withdraw", double.class).invoke(accountObject, 50.0);
            accountClass.getMethod("displayBalance").invoke(accountObject);

        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException |
                InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    // Dynamically create the Account class with specified methods and a balance field
    private static Class<?> createAccountClass() throws ClassNotFoundException {
        String className = "Account";
        String classContent = "public class " + className + " { "
                + "private double balance; "
                + "public " + className + "(double initialBalance) { "
                + "this.balance = initialBalance; "
                + "} "
                + "public void deposit(double amount) { "
                + "if (amount > 0) { "
                + "balance += amount; "
                + "} else { "
                + "System.out.println(\"Invalid deposit amount. Please enter a positive value.\"); "
                + "} "
                + "} "
                + "public void withdraw(double amount) { "
                + "if (amount > 0 && amount <= balance) { "
                + "balance -= amount; "
                + "} else { "
                + "System.out.println(\"Invalid withdrawal amount or insufficient funds.\"); "
                + "} "
                + "} "
                + "public void displayBalance() { "
                + "System.out.println(\"Current Balance: $\" + balance); "
                + "} "
                + "} ";

        return DynamicClassLoader.createClass(className, classContent, DynamicAccountCreation.class.getClassLoader());
    }
}
