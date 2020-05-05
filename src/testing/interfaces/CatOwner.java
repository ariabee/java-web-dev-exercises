package testing.interfaces;

import java.util.ArrayList;

public class CatOwner extends PetOwner{

    public CatOwner(ArrayList<Feedable> pets) {
        super(pets);
    }

    public void meowWithCat() {
        System.out.println("Meow with me, cat. Meow.");
    }
}
