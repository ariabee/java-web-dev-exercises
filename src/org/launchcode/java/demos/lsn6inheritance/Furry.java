package org.launchcode.java.demos.lsn6inheritance;

public abstract class Furry {

    private boolean mattedFur = false;

    // abstract classes can have abstract methods (signatures left empty for subclasses)
    public abstract boolean isSoft();

    // abstract methods tell inherited classes what they must define
    public abstract void groom();

}
