package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

import java.util.Collections;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        flavors.sort(comparator);

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        cones.sort(new ConeComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName() + ": " + flavor.getAllergens());
        }

        for (Cone cone : cones) {
            System.out.printf("%s: $%.2f\n", cone.getName(), cone.getCost());
        }

    }
}


















//Comparator comparator = new FlavorComparator();

//    flavors.sort(new FlavorComparator());

//    cones.sort(new ConeComparator());


//        for (Flavor flavor : flavors) {
//            System.out.println(flavor);
//        }
//
//        for (Cone cone : cones) {
//            System.out.println(cone);
//        }
//
//        for (Cone c : cones) {
//            System.out.printf("%s: $%.2f\n", c.getName(), c.getCost());
//        }