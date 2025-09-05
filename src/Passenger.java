import java.util.Locale;
import java.util.Scanner;

public class Passenger {
    private static int passengerCount=1;
    private String ticketId ="T";
    private String name;
    private int age;
    private String gender;
    private String berthPreference;
    private String allottedBerth;
    private boolean withChild;


    public Passenger(){
        Scanner sc = new Scanner(System.in);
        this.ticketId += passengerCount++;

        System.out.println("Enter the Passenger Name: ");
        this.name = sc.next();
        System.out.println("Enter Passenger Age :");
        this.age =sc.nextInt();
        System.out.println("Enter Passenger Gender (Female/Male) :");
        this.gender = sc.next().toLowerCase();
        if(gender.equalsIgnoreCase("female")){
            System.out.println("Are you with your child (yes / No): ");
            String val =sc.next();
            this.withChild = val.equalsIgnoreCase("yes");
        }
        System.out.println("Enter the Berth Preference :");
        this.berthPreference = sc.next().toUpperCase();

    }
    @Override
    public String toString(){
        return "TicketID:"+ticketId+"  Name:"+name+"  Age:"+age +"  Gender:"+gender+"  Allotted Berth:"+allottedBerth;
    }
    public int getAge(){ return age; }
    public String getName(){ return name; }
    public String getGender(){ return gender; }
    public String getBerthPreference(){ return berthPreference; }
    public String getTicketId(){ return ticketId; }
    public String getAllottedBerth(){ return allottedBerth; }
    public boolean getIsParent(){ return withChild; }


    public void setAllottedBerth(String s){ allottedBerth= s; }

}
