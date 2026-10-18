import java.util.*;

/**
 * @author Anish Naik Mamlekar
 * Main class - runs all OOP demonstrations for DCST NIRF System
 */
public class Main {

    public static void main(String[] args) {

        // FEATURE 1: OBJECT REFERENCING & CONSTRUCTORS
        System.out.println("\nOBJECT REFERENCING DEMO");

        Student s1 = new Student("S001", "Anish Naik", "anish@gbs.com",
                                  "2601", "MCA", 1, "2026-28");

        Student s2 = s1;   // s2 points to SAME object as s1

        System.out.println("Before change - s1 name: " + s1.getName());
        System.out.println("Before change - s2 name: " + s2.getName());

        s2.setName("Anish Kumar Naik");   // change via s2

        System.out.println("After change via s2 - s1 name: " + s1.getName());
        System.out.println("After change via s2 - s2 name: " + s2.getName());
        System.out.println("Same object? " + (s1 == s2));

      
        // FEATURE 2: STATIC COUNTER
        System.out.println("\nSTATIC COUNTER DEMO");
        Person.displayCount();


        // FEATURE 3: MULTIPLE INHERITANCE

        System.out.println("\nMULTIPLE INHERITANCE DEMO");

        TeachingStaff t = new TeachingStaff("F001", "Dr. HHR", "hhr@gbs.com",
                          "HOD", "CS&T", "PhD", 15, true);

        Reportable r = t;
        Rankable rk = t;
        Displayable d = t;

        System.out.println(r.generateReport());
        System.out.println("Rank Score: " + rk.getRankScore());
        d.display();


        // FEATURE 4: ACCESS MODIFIERS
        System.out.println("\nACCESS MODIFIERS DEMO");

        Course oot = new Course("CSA5001", "Object Oriented Technology", 4, 60);
        System.out.println("Public access -> courseCode: " + oot.courseCode);
        System.out.println("Public method -> credits: " + oot.getCredits());
        oot.display();


        // FEATURE 5 & 6: ABSTRACT CLASS + MESSAGE PASSING

        System.out.println("\nABSTRACT CLASS + MESSAGE PASSING DEMO");

        ExamActivity midpoint = new ExamActivity("Midpoint Exam", "2025-26",
                                 ActivityType.MIDPOINT, 15, 120, "Offline");
        midpoint.conduct();

        StudyTour tour = new StudyTour("Study Tour 2025", "2025-26",
                         "Bangalore", 45, "DCST GBS");
        tour.conduct();

        Student st = new Student("S002", "Priya Dessai", "priya@gbs.com",
                                  "2615", "MCA", 1, "2026-28");

        NIRFReportGenerator.generateNIRFEntry(st);
        NIRFReportGenerator.generateNIRFEntry(t);
        NIRFReportGenerator.showDetails(t);


        // FEATURE 7: POLYMORPHISM

        System.out.println("\nPOLYMORPHISM DEMO");

        NonTeachingStaff nts = new NonTeachingStaff("N001", "Ramesh Gawas",
                               "ramesh@gbs.com", "Lab Assistant", "IT Lab");

        Person[] people = { st, t, nts };

        for (Person per : people) {
            per.showRole();   // overriding - different behaviour each time
        }

        NonAcademicActivity infofest = new NonAcademicActivity("InfoFest 2025",
                                        "Tech Fest", "2025", 300, "GBS Auditorium");
        infofest.register("Anish");                              // overload 1
        infofest.register("Priya", "CodeStorm");                 // overload 2
        infofest.register("Rakshak", "CodeStorm", "Team Leader"); // overload 3


        // FEATURE 8: GENERICS & COLLECTIONS
        System.out.println("\nCOLLECTIONS DEMO");

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("S003", "Mayank Verma", "mayank@gbs.com", "2632", "MCA", 1, "2026-28"));
        studentList.add(new Student("S004", "Fatima Sheikh", "fatima@gbs.com", "2640", "MCA", 2, "2025-27"));
        System.out.println("Students (List): " + studentList.size());

        Set<String> programs = new HashSet<>();
        programs.add("MCA");
        programs.add("BCA");
        programs.add("MSc CS");
        programs.add("MCA");   // duplicate - ignored!
        System.out.println("Unique Programs: " + programs);

        Map<String, Integer> courseCredits = new HashMap<>();
        courseCredits.put("OOT Lab - CSA5005", 2);
        courseCredits.put("OOT Theory - CSA5001", 4);
        courseCredits.put("DBMS - CSA5002", 4);
        System.out.println("Courses & Credits: " + courseCredits);

        Queue<String> examQueue = new LinkedList<>();
        examQueue.offer("ISA 1");
        examQueue.offer("Midpoint");
        examQueue.offer("ISA 2");
        examQueue.offer("SEA");
        System.out.println("Exam Queue: ");
        while (!examQueue.isEmpty()) {
            System.out.println("  Next exam: " + examQueue.poll());
        }

        DataRepository<TeachingStaff> staffRepo = new DataRepository<>("DCST Faculty");
        staffRepo.add(t);
        staffRepo.displayAll();

        // FEATURE 9: EXCEPTION HANDLING
        System.out.println("\nEXCEPTION HANDLING DEMO");

        try {
            int sem = 7;   // invalid semester (changed from Scanner for simplicity)

            if (sem < 1 || sem > 6) {
                throw new NIRFException("Semester must be between 1-6", "INVALID_SEM");
            }
            System.out.println("Valid semester: " + sem);

        } catch (NIRFException e) {
            System.out.println("Custom Exception caught: " + e);
        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        } finally {
            System.out.println("Validation complete.");
        }

        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Null value caught: " + e.getMessage());
        } finally {
            System.out.println("Null check block done.");
        }


        // FEATURE 10: REFLECTION, CLONING, I/O
        System.out.println("\nCLONING DEMO");

        Student original = new Student("S010", "Anish Naik", "anish@gbs.com",
                                        "2601", "MCA", 1, "2026-28");

        try {
            Student shallow = original.shallowClone();
            System.out.println("Shallow Clone Name: " + shallow.getName());
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone error: " + e.getMessage());
        }

        Student deep = original.deepClone();
        deep.setName("Anish Deep Copy");
        System.out.println("Original after deep copy change: " + original.getName());
        System.out.println("Deep clone name: " + deep.getName());

        ReflectionUtil.reflect(original);

        ReflectionUtil.saveToFile(original.generateReport(), "nirf_data.txt");
        ReflectionUtil.saveToFile(t.generateReport(), "nirf_data.txt");
        ReflectionUtil.readFromFile("nirf_data.txt");

        System.out.println("\nALL FEATURES DEMONSTRATED SUCCESSFULLY");
    }
}