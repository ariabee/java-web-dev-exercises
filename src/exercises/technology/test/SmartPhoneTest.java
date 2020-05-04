package exercises.technology.test;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import exercises.technology.*;


public class SmartPhoneTest {

    SmartPhone phoney;

    @Before
    public void initPhone() {
        phoney = new SmartPhone(32,4,false,365);
    }

    @Test
    public void inheritsSuperInFirstConstructor() {
        assertEquals(32, phoney.getRam(), 0.001);
    }

    @Test
    public void inheritedCheckEmailReturnsTrue() {
        assertTrue(phoney.checkEmail());
    }

}
