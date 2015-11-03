package ca.eloas.factorial;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ebeljea on 11/2/15.
 * Copyright Ericsson.
 */
public class FactorialTest {

    @Test
    public void testFactFailsOnNegative() throws Exception {

        try {
            Factorial.fact(-1);
            fail();
        } catch (IllegalArgumentException e) {

            // test passed.
        }
    }

    @Test
    public void testFactorial() throws Exception {

        assertEquals(6, Factorial.fact(3));
    }

    @Test
    public void testZeroIsOne() throws Exception {

        assertEquals(1, Factorial.fact(0));
    }

}