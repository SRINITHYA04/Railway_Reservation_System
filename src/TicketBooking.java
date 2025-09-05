import  java.util.*;
public class TicketBooking {
    public static void main(String[] args) {
        TicketSystem ts = new TicketSystem();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Railway Reservation System.");
            System.out.println("1. Booking.");
            System.out.println("2. Cancellation.");
            System.out.println("3. View Confirmed Tickets.");
            System.out.println("4. View Available Tickets.");
            System.out.println("5. View RAC Tickets.");
            System.out.println("6. View Waiting List Tickets.");
            System.out.println("7. Exit.");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    ts.bookTickets();
                    break;
                case 2:
                    System.out.println("Enter TicketID fro Cancellation: ");
                    String id = sc.next();
                    ts.cancelTickets(id);
                    break;
                case 3:
                    ts.printBookedTickets();
                    break;
                case 4:
                    ts.printAvailableTickets();
                case 5:
                    ts.printBookedRAC();
                    break;
                case 6:
                    ts.printBookedWaitingList();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }


        }
    }
}