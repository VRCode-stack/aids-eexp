
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;

        do {
            try {
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();

                System.out.print("Enter operator (+, -, *, /): ");
                char op = sc.next().charAt(0);

                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                if (op == '+')
                    System.out.println("Result = " + (a + b));
                else if (op == '-')
                    System.out.println("Result = " + (a - b));
                else if (op == '*')
                    System.out.println("Result = " + (a * b));
                else if (op == '/') {
                    if (b != 0)
                        System.out.println("Result = " + (a / b));
                    else
                        System.out.println("Cannot divide by zero!");
                }
                else
                    System.out.println("Invalid operator!");

            } catch (Exception e) {
                System.out.println("Invalid input!");
                sc.nextLine();
            }

            System.out.print("Continue? (y/n): ");
            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');

        System.out.println("Calculator closed.");
        sc.close();
    }
}
