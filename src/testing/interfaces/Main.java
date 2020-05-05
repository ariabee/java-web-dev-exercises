package testing.interfaces;

public class Main {
    public static void main(String[] args) {
        Feedable cato = new Cat();

        //cato.meow(); doesn't work
        ((Cat) cato).meow();

        Walkable walkingCato = (Walkable) cato; // cast
    }
}
