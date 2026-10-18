/**
 * Teaching Staff — demonstrates Multiple Inheritance
 * Implements THREE interfaces + extends abstract Person
 */
public class TeachingStaff extends Person 
    implements Reportable, Rankable, Displayable {

    private String designation;     // Professor, Asst Prof, HOD
    private String department;
    private String qualification;   // PhD, MCA, MTech
    private int experienceYears;
    private boolean isPhD;

    public TeachingStaff(String id, String name, String email,
                         String designation, String department,
                         String qualification, int experienceYears, boolean isPhD) {
        super(id, name, email);
        this.designation = designation;
        this.department = department;
        this.qualification = qualification;
        this.experienceYears = experienceYears;
        this.isPhD = isPhD;
        TeachingStaff.incrementCount();
    }

    @Override
    public void showRole() {
        System.out.println(getName() + " is " + designation + " at " + department);
    }

    // From Reportable
    @Override
    public String generateReport() {
        return "FACULTY | " + getName() + " | " + designation +
               " | Exp: " + experienceYears + " yrs | PhD: " + isPhD;
    }

    // From Rankable
    @Override
    public int getRankScore() {
        int score = experienceYears * 5;
        if (isPhD) score += 20;
        return score;
    }

    @Override
    public String getRankCategory() { return "Teaching Quality"; }

    // From Displayable
    @Override
    public void display() {
        System.out.println("FACULTY: " + getName());
        System.out.println("Designation: " + designation);
        System.out.println("Dept: " + department);
        System.out.println("Qualification: " + qualification);
        System.out.println("Experience: " + experienceYears + " years");
        System.out.println("PhD: " + (isPhD ? "Yes" : "No"));
    }

    public String getDesignation() { return designation; }
    public String getDepartment() { return department; }
    public boolean isPhD() { return isPhD; }
    public int getExperienceYears() { return experienceYears; }
}