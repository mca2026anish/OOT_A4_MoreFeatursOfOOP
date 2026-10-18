import java.lang.reflect.*;
import java.io.*;

public class ReflectionUtil {

    // REFLECTION — inspect class at runtime
    public static void reflect(Object obj) {
        Class<?> cls = obj.getClass();
        System.out.println("\n=== REFLECTION: " + cls.getName() + " ===");
        System.out.println("Class: " + cls.getSimpleName());
        System.out.println("Superclass: " + cls.getSuperclass().getSimpleName());

        System.out.println("Fields:");
        for (Field f : cls.getDeclaredFields()) {
            System.out.println("  " + f.getType().getSimpleName() + " " + f.getName());
        }

        System.out.println("Methods:");
        for (Method m : cls.getDeclaredMethods()) {
            System.out.println("  " + m.getName() + "()");
        }

        System.out.println("Interfaces:");
        for (Class<?> i : cls.getInterfaces()) {
            System.out.println("  implements " + i.getSimpleName());
        }
    }

    // FILE I/O — PERSISTENCE (save to file)
    public static void saveToFile(String data, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(data);
            writer.newLine();
            System.out.println("Saved to " + filename);
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

    // FILE I/O — read from file
    public static void readFromFile(String filename) {
        System.out.println("\n=== READING FROM: " + filename + " ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File read error: " + e.getMessage());
        }
    }
}