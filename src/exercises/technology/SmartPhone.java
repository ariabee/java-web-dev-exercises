package exercises.technology;

public class SmartPhone extends Computer {

    private int numberOfCatSelfies;

    public SmartPhone(int ram, int storage, boolean hasKeyboard, int numberOfCatSelfies) {
        super(ram, storage, hasKeyboard);
        this.numberOfCatSelfies = numberOfCatSelfies;
    }

    public void takeCatSelfie() {
        this.numberOfCatSelfies++;
    }

    public int getNumberOfCatSelfies() {
        return this.numberOfCatSelfies;
    }

}
