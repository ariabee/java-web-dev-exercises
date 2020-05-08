package org.launchcode.java.demos.lsn6inheritance.wildcats;

public class LionProgram {

    public static void main(String[] args) {
        Lion leo = new Lion(15, "rarrry");

        // can't call another package's protected method
        //leo.thinkProtectedCatThought();
    }
}
