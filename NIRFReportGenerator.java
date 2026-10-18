/**
 * @author YourName
 * Demonstrates Class as Type & Message Passing
 */
public class NIRFReportGenerator {

    // Accepts ANY object implementing Reportable
    public static void generateNIRFEntry(Reportable r) {
        System.out.println("NIRF ENTRY >> " + r.generateReport());
    }

    // Accepts ANY object implementing Displayable
    public static void showDetails(Displayable d) {
        d.display();
    }
}