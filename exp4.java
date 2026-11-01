
import java.util.Scanner;

class HotelBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rooms[][] = new int[3][4];
        int choice, floor, room;

        do {
            System.out.println("\n--- HOTEL ROOM BOOKING ---");
            System.out.println("1. View Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n0 = Available, 1 = Booked");
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Floor " + (i + 1) + ": ");
                        for (int j = 0; j < 4; j++) {
                            System.out.print(rooms[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Enter floor (1-3): ");
                    floor = sc.nextInt();

                    System.out.print("Enter room number (1-4): ");
                    room = sc.nextInt();

                    if (floor >= 1 && floor <= 3 &&
                        room >= 1 && room <= 4) {

                        if (rooms[floor - 1][room - 1] == 0) {
                            rooms[floor - 1][room - 1] = 1;
                            System.out.println("Room booked successfully!");
                        } else {
                            System.out.println("Room already booked!");
                        }
                    } else {
                        System.out.println("Invalid floor or room number!");
                    }
                    break;

                case 3:
                    System.out.println("Thank you! Exiting system.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
