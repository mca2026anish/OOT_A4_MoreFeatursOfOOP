public abstract class Person implements Reportable, Displayable {

    private String id;
    private String name;
    private String email;

    // STATIC — belongs to CLASS not object
    private static int totalPersonCount = 0;

    public Person(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Static method — called without object
    public static void incrementCount() {
        totalPersonCount++;
    }

    public static int getTotalCount() {
        return totalPersonCount;
    }

    public static void displayCount() {
        System.out.println("Total persons registered in NIRF: " + totalPersonCount);
    }

    // Abstract methods — child must implement
    public abstract void showRole();
    public abstract String generateReport();

    // Getters and Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public void setName(String name) { this.name = name; }
    public void setId(String id) { this.id = id; }
    public void setEmail(String email) { this.email = email; }
}