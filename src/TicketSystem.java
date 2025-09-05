import java.util.*;

public class TicketSystem {
    private final List<String> availableBerths = new ArrayList<>();
    private final Queue<Passenger> RACqueue = new LinkedList<>();
    private final Queue<Passenger> WaitingListQueue = new LinkedList<>();
    private final List<Passenger> confirmedPassenger = new ArrayList<>();


    public TicketSystem(){
        for (int i = 1; i <= 63; i++) {
            availableBerths.add("L");
            availableBerths.add("M");
            availableBerths.add("U");
        }
    }
    public void bookTickets(){
        Passenger passenger = new Passenger();
        if(!availableBerths.isEmpty()){
            String allottedBerth = allocateBerth(passenger.getAge(), passenger.getBerthPreference(), passenger.getGender(), passenger.getIsParent());
            passenger.setAllottedBerth(allottedBerth);
            confirmedPassenger.add(passenger);
            availableBerths.remove(allottedBerth);
            System.out.println("Ticket Confirmed: "+passenger);
        }
        else if(RACqueue.size() < 18){
            passenger.setAllottedBerth("RAC");
            RACqueue.offer(passenger);
            System.out.println("Ticked Booked in RAC: "+ passenger);
        }
        else if(WaitingListQueue.size()<10){
            passenger.setAllottedBerth("WL");
            WaitingListQueue.offer(passenger);
            System.out.println("Ticked booked in Waiting List: "+passenger);
        }
        else{
            System.out.println("No Tickets Available....");
        }
    }

    private String allocateBerth(int age, String preference, String gender, boolean Mom) {
        if( ((gender.equalsIgnoreCase("female") && Mom) || (age > 60) ) && availableBerths.contains("L") ){
            return "L";
        }
         if(availableBerths.contains(preference)){
            return preference;
        }
         return availableBerths.getFirst();
    }

    public void cancelTickets(String ticketID){
        Optional<Passenger> optionalPassenger= confirmedPassenger.stream()
                                                .filter(p -> p.getTicketId().equalsIgnoreCase(ticketID))
                                                .findFirst();
        if(optionalPassenger.isPresent()) {
            Passenger passenger = optionalPassenger.get();
            confirmedPassenger.remove(passenger);
            availableBerths.add(passenger.getAllottedBerth());

            if (!RACqueue.isEmpty()) {
                Passenger RACpassenger = RACqueue.poll();
                String allottedBerth = allocateBerth(RACpassenger.getAge(), RACpassenger.getBerthPreference(), RACpassenger.getGender(), RACpassenger.getIsParent());
                RACpassenger.setAllottedBerth(allottedBerth);
                confirmedPassenger.add(RACpassenger);
                availableBerths.remove(RACpassenger.getAllottedBerth());
                System.out.println("Passenger moved from RAC to Confirmed: " + RACpassenger);
            }
            if (!WaitingListQueue.isEmpty()) {
                Passenger waitingPassenger = WaitingListQueue.poll();
                RACqueue.offer(waitingPassenger);
                waitingPassenger.setAllottedBerth("RAC");
                System.out.println("Passenger moved from WaitingList to RAC: " + waitingPassenger);
            }
            System.out.println("Ticket cancelled Successfully for ID: "+ ticketID);

        }
        else{
            System.out.println("No ticket found with ID: "+ticketID);
        }
    }

    public void printBookedTickets(){
        if(confirmedPassenger.isEmpty()){
            System.out.println("No tickets Booked yet!!");
        }
        else{
            System.out.println("Booked Tickets:");
            for (Passenger passenger :confirmedPassenger){
                System.out.println(passenger);
            }
        }
    }

    public void printAvailableTickets(){
        System.out.println("Availabale Berths:" + availableBerths.size());
        System.out.println("Available tickets in RAC: "+ (1-RACqueue.size()) );
        System.out.println("Available Tickets in WaitingList: "+ (1-WaitingListQueue.size()) );

    }

    public void printBookedRAC(){
        if(RACqueue.isEmpty()){
            System.out.println("No tickets Booked yet!!");
        }
        else{
            System.out.println("RAC Tickets:");
            for (Passenger passenger :RACqueue){
                System.out.println(passenger);
            }
        }
    }

    public void printBookedWaitingList(){
        if(WaitingListQueue.isEmpty()){
            System.out.println("No tickets Booked yet!!");
        }
        else{
            System.out.println("Waiting List Tickets:");
            for (Passenger passenger :WaitingListQueue){
                System.out.println(passenger);
            }
        }
    }




}
