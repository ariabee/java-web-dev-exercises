package exercises.technology;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Program {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop(800,8,true,4.0);
        SmartPhone myPhone = new SmartPhone(32,4,false,365);

        Computer lue = new Laptop(1,2,true, 1);
        System.out.println(lue.secret);

        System.out.println(myLaptop.hasTouchScreen());

        Computer[] devices = {myLaptop, myPhone, lue};
        for (Computer d : devices) {
            System.out.println(d.speak());
        }

        System.out.println(myLaptop.getId());
        System.out.println(myPhone.getId());

        if (myLaptop.isClunky()) {
            System.out.println("My laptop is so heavy!");
        }
        else {
            System.out.println("My laptop is so light!");
        }

        myPhone.takeCatSelfie();

        System.out.println("My cat just took a selfie! I now have " + myPhone.getNumberOfCatSelfies() + " cat self-purrtraits on my phone!");
    }
}












//    Random rand = new Random();
//    int randomInt = rand.nextInt();
//
//    int mathRand = (int) (Math.random() * 50);

//    // Take a random number of selfies!
//    int localRand = ThreadLocalRandom.current().nextInt(0, 50 + 1);
//
//        for (int i = 0; i < localRand; i++) {
//        myPhone.takeSelfie();
//        }

////System.out.println(lue.secret);
//        lue.increaseStorage(5);