package testing.interfaces;

public class Cat implements Feedable, Walkable {

    private int catBelly = 0;

    @Override
    public void eat() {
        catBelly ++;
    }

    public int getBellySize() {
        return catBelly;
    }

    public void meow() {
        System.out.println("meow...");
    }

    @Override
    public void walk(double distance) {
        System.out.println("walking " + distance + " units on my cat paws");
    }
}
