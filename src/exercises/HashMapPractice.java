package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    // Make a program similar to GradebookHashMap
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentName;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student IDs and names from user as Integers and Strings
        do {
            System.out.print("Student: ");
            studentName = input.nextLine();

            if (!studentName.equals("")) {

                System.out.print("ID: ");
                Integer newID = input.nextInt();
                students.put(newID, studentName);

                // Read in the newline (that comes after the Integer) before looping back
                input.nextLine();
            }
        } while(!studentName.equals(""));

        input.close();

        // Modify the roster printing code accordingly: <Name>'s ID: <ID>
        System.out.println("Class roster: ");
        for(Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in the class: " + students.size());

    }
}
