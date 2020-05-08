package org.launchcode.java.demos.lsn6inheritance.wildcats;

import org.launchcode.java.demos.lsn6inheritance.Cat;

public class Lion extends Cat {

    private String roar;

    public Lion(double aWeight, String roar) {
        super(aWeight);
        this.roar = roar;
    }
}
