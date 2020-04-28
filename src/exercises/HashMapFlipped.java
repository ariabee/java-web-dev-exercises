package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
  Prompts the user for Integer ID first, then String name.
*/
public class HashMapFlipped {

    // Make a program similar to GradebookHashMap
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentName;
        Integer newID;
        String newIDString;

        System.out.println("Enter your students (or ENTER to finish):");

        do {
            System.out.print("ID: ");
            // Take in expected ID as a string
            newIDString = input.nextLine();

            // See if the input string has an Integer value. Assign ID to -1 if not.
            try {
                newID = Integer.valueOf(newIDString);
            } catch (NumberFormatException e){
                newID = -1;
            }

            // If a valid student ID is entered, prompt for student name
            if (!newID.equals(-1)) {

                System.out.print("Student: ");
                studentName = input.nextLine();

                students.put(newID, studentName);

                // Read in the newline before looping back
                // input.nextLine();
            }
        } while(!newID.equals(-1));

        input.close();

        // Modify the roster printing code accordingly: <Name>'s ID: <ID>
        System.out.println("\nClass roster: ");
        for(Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in the class: " + students.size());

    }
}
