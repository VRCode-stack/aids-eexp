
import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;
        int choice = 0;

        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            try {
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Balance = Rs." + balance);
                        break;

                    case 2:
                        System.out.print("Enter amount: ");
                        double deposit = sc.nextDouble();

                        if (deposit <= 0)
                            throw new IllegalArgumentException("Invalid amount!");

                        balance += deposit;
                        System.out.println("Amount deposited successfully.");
                        break;

                    case 3:
                        System.out.print("Enter amount: ");
                        double withdraw = sc.nextDouble();

                        if (withdraw <= 0)
                            throw new IllegalArgumentException("Invalid amount!");

                        if (withdraw > balance)
                            throw new ArithmeticException("Insufficient funds!");

                        balance -= withdraw;
                        System.out.println("Withdrawal successful.");
                        break;

                    case 4:
                        System.out.println("Thank you for using ATM!");
                        break;

                    default:
                        throw new IllegalArgumentException("Invalid choice!");
                }

            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());

            } catch (Exception e) {
                System.out.println("Invalid input!");
                sc.nextLine();

            } finally {
                System.out.println("Transaction completed.");
            }

        } while (choice != 4);

        sc.close();
    }
}
