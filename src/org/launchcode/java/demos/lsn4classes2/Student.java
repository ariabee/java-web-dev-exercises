package org.launchcode.java.demos.lsn4classes2;

import javax.swing.text.Style;
import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
//    public String getGradeLevel() {
//        // Determine the grade level of the student based on numberOfCredits
//    }

    public String getGradeLevel( int credits ) {
        // Determine the grade level of the student based on numberOfCredits
        if (credits <= 29) {
            return "freshman";
        } else if (credits <= 59) {
            return "sophomore";
        } else if (credits <= 89) {
            return "junior";
        } else {
            return "senior";
        }
    }

    // TODO: Complete the addGrade method.
    /**
     * Add a course grade, updating the student's GPA and total credits.
     * Calculate the new GPA using gpa = (total quality score) / (total number of credits)
     *
     * @param courseCredits The number of credits in the course
     * @param courseGrade The final grade from the course
     */
    public void addGrade(int courseCredits, double courseGrade) {
        // Update the appropriate fields: numberOfCredits, gpa
        // quality score for course: letter grade aka gpa (0.0-4.0) * number of credits
        // quality score for all courses: gpa * credits. Aka sum of all quality scores
        double qualityScore = courseCredits * courseGrade;
        double totalQualityScore = (this.numberOfCredits * this.gpa) + qualityScore;
        this.numberOfCredits += courseCredits;
        this.gpa += totalQualityScore / this.numberOfCredits;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.
    @Override
    public String toString() {;
        String report = name + " is a " + getGradeLevel(numberOfCredits) + " with " + numberOfCredits + " credits and a GPA of " + gpa;
        String reportFormatted = String.format("name %s is a %s with %d credits and a GPA of %.2f", name, getGradeLevel(numberOfCredits), numberOfCredits, gpa);
        String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", name, getGradeLevel(numberOfCredits), getNumberOfCredits(), getGpa());
        return reportFormatted;
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.
    @Override
    public boolean equals(Object o) {
        // Check for identity --> true
        // Check for null --> false
        // Check for same class --> then can cast and compare
        Student s = (Student) o;
        return s.getStudentId() == this.getStudentId();
    }

    public String getName() { return name; }
    public int getStudentId() { return studentId; }
    public int getNumberOfCredits() { return numberOfCredits; }
    public double getGpa() { return gpa; }

    public void setName(String name) { this.name = name; }
    public void setStudentId(int studentId) { this.studentId = studentId; }
    public void setGpa(double gpa) { this.gpa = gpa; }
    private void setNumberOfCredits(int numberOfCredits) { this.numberOfCredits = numberOfCredits; }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);

        System.out.println(sally.toString());
    }
}
