/**
 * Course class — demonstrates all access modifiers
 */
public class Course {

    public String courseCode;        // PUBLIC — accessible anywhere
    protected String courseName;     // PROTECTED — same package + subclass
    private int credits;             // PRIVATE — only inside this class
    int duration;                    // DEFAULT — same package only

    private static int courseCount = 0;

    public Course(String courseCode, String courseName, int credits, int duration) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.duration = duration;
        courseCount++;
    }

    // Private method — only usable inside Course
    private void validateCredits() {
        if (credits < 1 || credits > 6) {
            System.out.println("Warning: Unusual credit count for " + courseName);
        }
    }

    // Public getter for private field
    public int getCredits() {
        validateCredits();   // private method called inside class ✓
        return credits;
    }

    public static int getCourseCount() { return courseCount; }

    public String getCourseName() { return courseName; }

    public void display() {
        System.out.println("[" + courseCode + "] " + courseName +
                           " | Credits: " + credits + " | Duration: " + duration + " hrs");
    }
}