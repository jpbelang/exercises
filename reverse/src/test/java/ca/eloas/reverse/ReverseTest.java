package ca.eloas.reverse;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ebeljea on 11/2/15.
 * Copyright Ericsson.
 */
public class ReverseTest {

    @Test
    public void testReverse() throws Exception {

        String[] reversed = Reverse.reverse(new String[]{"a", "b", "c"});
        assertEquals("c", reversed[0]);
        assertEquals("b", reversed[1]);
        assertEquals("a", reversed[2]);
        assertEquals(3, reversed.length);
    }

    @Test
    public void testReverseEmpty() throws Exception {

        String[] reversed = Reverse.reverse(new String[]{});
        assertEquals(0, reversed.length);
    }

}