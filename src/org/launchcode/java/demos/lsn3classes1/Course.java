package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {

    // What fields does a course need?
    private String courseName;
    private int courseTime;
    private ArrayList<Student> students;
    private int courseId;
    private Teacher instructor;

    public Course( ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}

























//    private String topic;
//    private Teacher instructor;
//    private ArrayList<Student> classlist;
//    private HashMap<Student, Double> gradebook;