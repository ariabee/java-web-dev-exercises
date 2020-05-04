package exercises.technology;

import java.util.concurrent.ThreadLocalRandom;

public abstract class AbstractEntity {
    private int iD;
    public static String secret = "I'm inside the box!";

    // This constructor is automatically called when an instance of an inherited class (Computer,...) is created
    public AbstractEntity() {
        this.iD = ThreadLocalRandom.current().nextInt(0, 100 + 1);
    }

    public int getId() {
        return this.iD;
    }

    // Try abstract method

}














//public abstract String speak();