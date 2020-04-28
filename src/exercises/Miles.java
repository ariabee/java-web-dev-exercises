package exercises;
import java.util.Scanner;

public class Miles {
    public static void main( String[] args) {

        // Ask user for number of miles driven
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of miles driven: ");
        double miles = input.nextDouble();

        // Ask user for number of gallons consumed
        System.out.println("Please enter the number of gallons consumed: ");
        double gallons = input.nextDouble();

        // Calculate and print mpg
        double mpg = miles / gallons;
        System.out.println("You drove " + mpg + " mpg.");

        input.close();
    }
}
