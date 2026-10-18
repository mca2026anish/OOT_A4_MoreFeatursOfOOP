/**
 * Abstract class for Academic Activities at DCST
 */
public abstract class AcademicActivity {

    protected String activityName;
    protected String academicYear;
    protected ActivityType type;
    protected String description;

    public AcademicActivity(String activityName, String academicYear,
                             ActivityType type, String description) {
        this.activityName = activityName;
        this.academicYear = academicYear;
        this.type = type;
        this.description = description;
    }

    public abstract void conduct();
    public abstract String getSummary();

    // Concrete method — shared by all
    public void printHeader() {
        System.out.println("\n");
        System.out.println("  ACTIVITY: " + activityName);
        System.out.println("  TYPE: " + type);
        System.out.println("  YEAR: " + academicYear);
    }
}