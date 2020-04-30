package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Arrays;

public class SchoolPractice {

    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student harry = new Student("Harry", 934, 10, 3.0);
        Student ron = new Student("Ron", 456);

        System.out.println(ron.getNumberOfCredits());

        Course java = new Course(new ArrayList<Student>(Arrays.asList(new Student("Hermione", 1010))));

        // Print arrayList of students in course 2 ways:
        System.out.println(Arrays.toString(java.getStudents().toArray())); // prints student mem address

        for (Student s : java.getStudents()) {
            System.out.println(s.getName());
        }

        // Can modify arraylist field since we pass it directly instead of a copy
        java.getStudents().add(harry);

        System.out.println("Now the students in the course are: ");
        for (Student s : java.getStudents()) {
            System.out.println(s.getName());
        }


    }
}
