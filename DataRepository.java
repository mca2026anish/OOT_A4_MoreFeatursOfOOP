import java.util.*;

/**
 * Generic class — works with ANY type T
 * T can be Student, TeachingStaff, Course, Activity, etc.
 */
public class DataRepository<T> {

    private List<T> items = new ArrayList<>();
    private String repositoryName;

    public DataRepository(String name) {
        this.repositoryName = name;
    }

    public void add(T item) { items.add(item); }

    public T get(int index) { return items.get(index); }

    public int size() { return items.size(); }

    public List<T> getAll() { return items; }

    // Generic static method
    public static <T extends Reportable> void printAllReports(List<T> list) {
        System.out.println("\nALL REPORTS:");
        for (T item : list) {
            System.out.println(item.generateReport());
        }
    }

    public void displayAll() {
        System.out.println("\n── Repository: " + repositoryName + " ──");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).toString());
        }
    }
}