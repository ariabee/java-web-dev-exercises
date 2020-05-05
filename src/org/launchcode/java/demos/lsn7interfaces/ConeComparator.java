package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone c1, Cone c2) {
        // return -1 if c1 cost - c2 cost < 0 (c1 is < c2)
        // return 1 if c1 cost - c2 cost > 0  (c1 > c2 )
        // else return 0, costs are equal
        if (c1.getCost() < c2.getCost()){
            return -1;
        } else if (c1.getCost() > c2.getCost()) {
            return 1;
        } else {
            return 0;
        }

    }
}
