package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    // Constructors
    // Note: try to keep naming style (with "this." or different arg name) consistent
    public Student(String name, int studentId, int numberOfCredits, double myGpa) {
        this.name = name;
        setStudentId(studentId);
        this.numberOfCredits = numberOfCredits;
        gpa = myGpa;
    }
    public Student(String name, int studentId) {
        this(name, studentId, 10, 0.0);
    }

    // Setters
    public void setName(String aName) {
        name = aName;
    }

    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Getters
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



}
