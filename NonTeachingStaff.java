/**
 * @author YourName
 * Represents Non-Teaching Staff at DCST, GBS
 */
public class NonTeachingStaff extends Person {

    private String designation;   // Lab Assistant, Clerk, Peon
    private String workArea;      // IT Lab, Office, Library

    public NonTeachingStaff(String id, String name, String email,
                             String designation, String workArea) {
        super(id, name, email);
        this.designation = designation;
        this.workArea = workArea;
        NonTeachingStaff.incrementCount();
    }

    @Override
    public void showRole() {
        System.out.println(getName() + " is Non-Teaching Staff [" + designation + "]");
    }

    @Override
    public String generateReport() {
        return "NON-TEACHING STAFF | " + getName() + " | " + designation + " | " + workArea;
    }

    @Override
    public void display() {
        System.out.println("│ NON-TEACHING STAFF: " + getName());
        System.out.println("│ Designation: " + designation);
        System.out.println("│ Work Area: " + workArea);
    }

    public String getDesignation() { return designation; }
    public String getWorkArea() { return workArea; }
}