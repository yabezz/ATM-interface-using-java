import java.util.*;

public class ATM_interface {
  public static void main(String[] args) {
    // basic
    int pin = 1234;
    int balance = 10000;
    int addAmount = 0;
    int takeAmount = 0;
    String name;
    // password change
    int newPassword1 = 0;
    int newPassword = 0;
    int passwordToBeVerified = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the following details");
    System.out.println("Enter your pin number :");
    int password = sc.nextInt();

    if (password == pin) {
      System.out.println("Enter your name :");
      sc.nextLine();
      name = sc.nextLine();
      System.out.println("Welcome " + name);

      while (true) {
        System.out.println("Press 1 to check your balance");
        System.out.println("press 2 to add amount");
        System.out.println("press 3 to withdraw amount");
        System.out.println("press 4 to take receipt");
        System.out.println("press 5 to Change account password");
        System.out.println("Press 6 to exit");

        int option = sc.nextInt();
        switch (option) {
          case 1:
            System.out.println("Your current balance is : " + balance);
            System.out.println();
            break;
          case 2:
            System.out.println("Enter deposit amount :");
            addAmount = sc.nextInt();
            balance = balance + addAmount;
            System.out.println("Successfully credited Rs." + addAmount + " to your account");
            System.out.println("Current Balance is : " + balance);
            System.out.println();
            break;
          case 3:
            System.out.println("Enter amount to withdraw : ");
            takeAmount = sc.nextInt();
            if (takeAmount > balance) {
              System.out.println("Insufficient Balance");
              System.out.println("Try less than your available balance");
            } else {
              System.out.println("Successfully debited");
              balance = balance - takeAmount;
            }
            System.out.println();
            break;
          case 4:
            System.out.println("Welcome to Bank of Ocean ATM");
            System.out.println("Available balance : " + balance);
            System.out.println("Amount taken : " + addAmount);
            System.out.println("amount deposited : " + takeAmount);
            System.out.println("Thanks for using Bank of Ocean ATM");
            System.out.println();
            break;
          case 5:
            System.out.println("Verification required!");
            System.out.println("Enter your current password");
            passwordToBeVerified = sc.nextInt();
            if (passwordToBeVerified == password) {
              System.out.println("Verification successful!");
              System.out.println("Enter new password (four digits required) :");
              newPassword = sc.nextInt();
              System.out.println("Re-enter new password");
              newPassword1 = sc.nextInt();
              if (newPassword == newPassword1) {
                password = newPassword;
                System.out.println("Password change was successful!");
              } else {
                System.out.println("Entered passwords does n't match, Take your card and try again");
              }
            } else {
              System.out.println("Entered password was wrong");
              System.out.println("Try again later");
            }
          default:
            System.out.println("Enter the number below 6");
            System.out.println();
            break;
        }
        if (option == 6) {
          System.out.println("Thankyou, come again!");
          System.out.println();
          return;
          // sc.close();
        }
      }
    } else {
      System.out.println("The Entered pin number was wrong");
      System.out.println("Take your card and Try again");
      sc.close();
    }

  }
}