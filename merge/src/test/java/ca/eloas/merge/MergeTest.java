package ca.eloas.merge;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ebeljea on 11/2/15.
 * Copyright Ericsson.
 */
public class MergeTest {

    @Test
    public void testMerge() throws Exception {

        String[] one = {"a", "b"};
        String[] two = {"1", "2"};

        String[] result = Merge.merge(one, two);

        assertEquals(4, result.length);
        assertEquals("a", result[0]);
        assertEquals("b", result[1]);
        assertEquals("1", result[2]);
        assertEquals("2", result[3]);
    }
}