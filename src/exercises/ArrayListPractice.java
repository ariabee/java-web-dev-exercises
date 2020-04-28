package exercises;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
    1. Write a static method to find the sum of all the even numbers in an ArrayList.
    Within main, create a list with at least 10 integers and call your method on the list.

    2. Write a static method to print out each word in a list that has exactly 5 letters.

    3. Modify your code to prompt the user to enter the word length for the search.

    4.BONUS: Instead of creating our own list of words, what if we want to use the string
    from the Array Practice section? Search “Java convert String to ArrayList”
    online to see how to split a string into the more flexible ArrayList collection.
 */

public class ArrayListPractice {
    /* main method runs the class */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare and initialize array lists.
        ArrayList<Integer> someInts = new ArrayList<>(Arrays.asList(1, 2, 6, 87, 100, 5, 3, 4, 6, 7));
        ArrayList<String> someWords = new ArrayList<>(Arrays.asList("hello", "apple", "toe", "quarantine", "lysol"));

        String phrase = ArrayPractice.getPhrase();
        // String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<String> words = new ArrayList<>(Arrays.asList(phrase.split(" ")));

        // Sum the even Integers. Print results.
        System.out.println(sumEven(someInts));

        // Prompt the user to enter the word length for the search.
        System.out.println("Please enter a word length to search for: ");
        int length = input.nextInt();

        input.close();

        // Call method to print out words of the chosen length. Pass in ArrayList of words, length.
        printAnyLetterWords(words, length);
    }

    /* Write a static method to find the sum of all the even numbers in an ArrayList */
    public static int sumEven(ArrayList<Integer> arr){
        int total = 0;

        for (int i : arr) {
            if (i%2 == 0) {
                total += i;
            }
        }
        return total;
    }

    /* Write a static method to print out each word in a list that has exactly 'length' letters*/
    public static void printAnyLetterWords(ArrayList<String> arr, int length) {
        for (String word : arr) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }

}