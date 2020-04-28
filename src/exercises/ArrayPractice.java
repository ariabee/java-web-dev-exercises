package exercises;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        // Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
        int[] intArray = {1, 1, 2, 3, 5, 8};
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        // Print out each number in the array
        for(int intElement : intArray) {
            System.out.println(intElement);
        }

        // Print out each odd number in the array
        for(int i : intArray ) {
            if (i%2 != 0) {
                System.out.println(i);
            }
        }

        // Split phrase by spaces into an array of words, then print the array: System.out.println(Arrays.toString(arrayName));
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        // Split phrase by "\\." into an array of sentences, then print the array.
        // "." does not work as-is for the deliminator. "\\." escapes it's special meaning.
        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }

    public static String getPhrase() {
        return "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
    }
}
