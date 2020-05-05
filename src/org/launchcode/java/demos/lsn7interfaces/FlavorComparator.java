package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor f1, Flavor f2) {

        //return f1.getName().compareTo(f2.getName());

        // sort from highest to lowest number of allergens
        return f2.getAllergens().size() - f1.getAllergens().size();
    }


}

















//        return f1.getName().compareTo(f2.getName());

// Bonus: sort the flavors from HIGHEST to lowest number of allergens
//        return f2.getAllergens().size() - f1.getAllergens().size();