package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

    // Fields
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    // Setters
    public void setFirstName( String aFirstName ) {
        firstName = aFirstName;
    }
    public void setYearsTeaching( int years ) {
        yearsTeaching = years;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }
    public int getYearsTeaching() {
        return yearsTeaching;
    }
}
