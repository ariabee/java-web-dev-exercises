package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor f1, Flavor f2) {
        //return f1.getName().compareTo(f2.getName()); // returns an integer (negative, positive, or zero) depending on whether Flavor object o1 or o2 comes first, alphabetically

        // Bonus: sort the flavors from HIGHEST to lowest number of allergens
        return f2.getAllergens().size() - f1.getAllergens().size();
    }


}
