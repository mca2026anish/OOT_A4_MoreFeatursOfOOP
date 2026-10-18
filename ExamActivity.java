public class ExamActivity extends AcademicActivity {

    private int totalMarks;
    private int durationMinutes;
    private String examMode;   // Online / Offline / Lab

    public ExamActivity(String name, String year, ActivityType type,
                         int totalMarks, int durationMins, String mode) {
        super(name, year, type, "Examination activity");
        this.totalMarks = totalMarks;
        this.durationMinutes = durationMins;
        this.examMode = mode;
    }

    @Override
    public void conduct() {
        printHeader();
        System.out.println("Conducting " + activityName);
        System.out.println("Mode: " + examMode);
        System.out.println("Duration: " + durationMinutes + " mins");
        System.out.println("Total Marks: " + totalMarks);
    }

    @Override
    public String getSummary() {
        return activityName + " | " + examMode + " | " + totalMarks + " marks";
    }
}