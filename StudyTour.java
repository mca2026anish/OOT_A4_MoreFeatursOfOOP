public class StudyTour extends AcademicActivity {

    private String destination;
    private int numberOfStudents;
    private String organizer;

    public StudyTour(String name, String year, String destination,
                     int students, String organizer) {
        super(name, year, ActivityType.STUDY_TOUR, "Industrial/Educational visit");
        this.destination = destination;
        this.numberOfStudents = students;
        this.organizer = organizer;
    }

    @Override
    public void conduct() {
        printHeader();
        System.out.println("Destination: " + destination);
        System.out.println("Students: " + numberOfStudents);
        System.out.println("Organized by: " + organizer);
    }

    @Override
    public String getSummary() {
        return activityName + " | " + destination + " | " + numberOfStudents + " students";
    }
}