package exercises.technology;

public class Laptop extends Computer {

    private double weight; // laptop weight in pounds.

    public Laptop(int ram, int storage, boolean hasKeyboard, double weight) {
        super(ram, storage, hasKeyboard);
        this.weight = weight;
    }

    public boolean isClunky() {
        return (weight > 5.0);
    }

}
