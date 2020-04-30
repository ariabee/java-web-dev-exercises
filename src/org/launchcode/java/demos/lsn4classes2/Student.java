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


     // Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if (numberOfCredits <= 29) {
            return "Freshman";
        } else if (numberOfCredits <= 59) {
            return "Sophomore";
        } else if (numberOfCredits <= 89) {
            return "Junior";
        } else {
            return "Senior";
        }
    }


    // Complete the addGrade method.
    /**
     * Add a course grade, updating the student's GPA and total credits.
     * Calculate the new GPA using gpa = (total quality score) / (total number of credits)
     *
     * @param courseCredits The number of credits in the course
     * @param courseGrade The final grade from the course
     */
    public void addGrade(int courseCredits, double courseGrade) {
        double courseQualityScore = courseCredits * courseGrade;
        double totalQualityScore = (this.gpa * this.numberOfCredits) + courseQualityScore;
        this.numberOfCredits += courseCredits;
        gpa = totalQualityScore / this.numberOfCredits;
    }

    // Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.
    @Override
    public String toString() {
        //return "Student name: " + name + "\nStudent Id: " + studentId + "\nGPA: " + gpa;
        return String.format("Student name: %s \nStudent Id: %d \nGPA: %.2f", name, studentId, gpa);
    }


    // Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Student s = (Student) o;
        return studentId == s.getStudentId() &&
                name == s.getName() &&
                gpa == s.getGpa();
    }
        // Check for identity --> true
        // Check for null --> false
        // Check for same class --> then can cast and compare


    public String getName() {
        return name;
    }
    public int getStudentId() {
        return studentId;
    }
    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println("Sally's new GPA: " + sally.getGpa());

        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
        System.out.println(sally.getGradeLevel());

        Student sally2 = new Student("Sally", 1, 234, 3.0);
        System.out.println(sally.equals(sally2));

        Course java = new Course("Java", new Teacher("The", "Teacher", "Java", 12));
        System.out.println( "\n" + java);
    }
}