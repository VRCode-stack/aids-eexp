
import java.util.Scanner;

class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size!");
            sc.close();
            return;
        }

        int a[] = new int[n];
        int sum = 0, max, min;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        max = min = a[0];

        for (int i = 0; i < n; i++) {
            if (a[i] > max)
                max = a[i];

            if (a[i] < min)
                min = a[i];
        }

        System.out.print("Array elements: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");

        System.out.println("\nMaximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (double)sum / n);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                System.out.println("Element found at position " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Element not found.");

        sc.close();
    }
}
