package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Teacher teacher = (Teacher) o;
        return firstName.equals(teacher.firstName) &&
                lastName.equals(teacher.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
