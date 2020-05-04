package exercises.technology;

public class Computer extends AbstractEntity{
    private int ram;
    private int storage;
    private boolean hasKeyboard;

    public Computer(int ram, int storage, boolean hasKeyboard) {
        this.ram = ram;
        this.storage = storage;
        this.hasKeyboard = hasKeyboard;
    }

    public int getRam() {
        return ram;
    }
    public int getStorage() {
        return storage;
    }
    public boolean getHasKeyboard() {
        return hasKeyboard;
    }

    public void increaseRAM(int n) {
        this.ram += n;
    }

    public void increaseStorage(int x) {
        this.storage += x;
        System.out.println(this.secret);
    }
}










//    @Override
//    public String speak() {
//        return "Psst, I am your computer.";
//    }