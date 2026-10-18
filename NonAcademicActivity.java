/**
 * NonAcademicActivity — demonstrates overloading
 */
public class NonAcademicActivity {

    private String eventName;
    private String eventType;
    private String year;
    private int participants;
    private String venue;

    // CONSTRUCTOR OVERLOADING
    public NonAcademicActivity(String eventName, String eventType, String year) {
        this.eventName = eventName;
        this.eventType = eventType;
        this.year = year;
        this.participants = 0;
        this.venue = "DCST, GBS Campus";
    }

    public NonAcademicActivity(String eventName, String eventType,
                                String year, int participants, String venue) {
        this.eventName = eventName;
        this.eventType = eventType;
        this.year = year;
        this.participants = participants;
        this.venue = venue;
    }

    // METHOD OVERLOADING — same name, different parameters
    public void register(String studentName) {
        System.out.println(studentName + " registered for " + eventName);
    }

    public void register(String studentName, String teamName) {
        System.out.println(studentName + " (Team: " + teamName + ") registered for " + eventName);
    }

    public void register(String studentName, String teamName, String role) {
        System.out.println(studentName + " [" + role + "] in Team " + teamName + " — " + eventName);
    }

    public void display() {
        System.out.println("EVENT: " + eventName + " | " + eventType +
                           " | Year: " + year + " | Venue: " + venue +
                           " | Participants: " + participants);
    }

    public String getEventName() { return eventName; }
}