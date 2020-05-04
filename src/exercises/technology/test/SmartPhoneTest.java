package exercises.technology.test;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import exercises.technology.*;


public class SmartPhoneTest {
    @Test
    public void inheritsSuperInFirstConstructor() {
//        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
//        assertEquals(7, keyboardCat.getWeight(), .001);
        SmartPhone sue = new SmartPhone(32,4,false,365);
        assertEquals(32, sue.getRam(), 0.001);
    }
}
