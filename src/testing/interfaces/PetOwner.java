package testing.interfaces;

import java.util.ArrayList;

public class PetOwner {

    private ArrayList<Feedable> pets;

    public PetOwner(ArrayList<Feedable> pets) {
        this.pets = pets;
    }

    public void addPet(Feedable pet) {
        pets.add(pet);
    }

    public void feedPets() {
        for (Feedable pet : pets) {
            pet.eat();
        }
    }
}
