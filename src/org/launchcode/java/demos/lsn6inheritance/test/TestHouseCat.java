package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;


public class TestHouseCat {
    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }
}
