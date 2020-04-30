package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic, Teacher instructor) {
        this.topic = topic;
        this.instructor = instructor;
    }

    // Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    // just the class fields.
    public String toString() {
        return "Course: " + topic + ", Teacher: " + instructor;
    }


    // Add your custom 'equals' method here. Consider which fields should match in order to call two
    // Course objects equal.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return topic.equals(course.topic) &&
                instructor.equals(course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, instructor);
    }
}
