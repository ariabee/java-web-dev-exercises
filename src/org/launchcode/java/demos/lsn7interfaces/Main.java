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



        ArrayList<String> words = new ArrayList<>(Arrays.asList("zoo", "book", "falafel", "juniper", "coin"));

        Collections.sort(cones);

        for (String word : words) {
            System.out.print(word + " ");
        }





        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.


        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.


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