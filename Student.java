/**
 * @author YourName
 * Represents a Student at DCST, GBS
 */
public class Student extends Person implements Cloneable {

    private String rollNo;
    private String program;
    private int semester;
    private String batch;

    public Student(String id, String name, String email,
                   String rollNo, String program, int semester, String batch) {
        super(id, name, email);
        this.rollNo = rollNo;
        this.program = program;
        this.semester = semester;
        this.batch = batch;
        Student.incrementCount();
    }

    @Override
    public void showRole() {
        System.out.println(getName() + " is a Student [" + program + " Sem " + semester + "]");
    }

    @Override
    public String generateReport() {
        return "STUDENT REPORT | Roll: " + rollNo + " | " + getName() + " | " + program;
    }

    @Override
    public void display() {
        System.out.println("STUDENT: " + getName());
        System.out.println("Roll No: " + rollNo);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Batch: " + batch);
    }

    // SHALLOW CLONE
    public Student shallowClone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    // DEEP CLONE
    public Student deepClone() {
        return new Student(
            new String(this.getId()),
            new String(this.getName()),
            new String(this.getEmail()),
            new String(this.rollNo),
            new String(this.program),
            this.semester,
            new String(this.batch)
        );
    }

    public String getRollNo() { return rollNo; }
    public String getProgram() { return program; }
    public int getSemester() { return semester; }
    public String getBatch() { return batch; }
}