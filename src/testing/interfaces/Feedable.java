package testing.interfaces;

public interface Feedable {

    void eat();

    // can have static methods, but must have a body
    static boolean isHungry() {
        return true;
    }
}
