package org.launchcode.java.demos.lsn6inheritance;

public class CatProgram {
    public static void main(String[] args){

        Cat c = new Cat(15);
        HouseCat meow = new HouseCat("Meow",10);

        System.out.println(meow.getWeight());

        c.thinkProtectedCatThought();
    }
}
