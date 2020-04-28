package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class PrintArea {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        double radius = input.nextDouble();
        double areaOfCircle = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + areaOfCircle + " units^2");

        // Bonus 1: Add validation to your program. If the user enters a negative number?
        // a non-numeric character? the empty string? Print an error message and quit.
        // You’ll need to peek ahead to learn about conditional syntax in Java.

        // Bonus 2: Extend your program further by using a while or do-while loop,
        // so that when the user enters a negative number they are re-prompted.
    }
}
