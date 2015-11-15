package ca.eloas.cards;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ebeljea on 11/15/15.
 * Copyright Ericsson.
 */
public class FunctionalCardShuffleTest {

    @Test
    public void testProperlyShuffled() throws Exception {

        assertTrue(FunctionalCardShuffle.properlyShuffled( Arrays.asList(3,2,1)));
        assertFalse(FunctionalCardShuffle.properlyShuffled( Arrays.asList(3,1,2)));
    }

    @Test
    public void testCreateSortedDeck() throws Exception {

        List<Integer> deck = FunctionalCardShuffle.createSortedDeck();
        assertEquals(52, deck.size());
        for(int a = 0; a < deck.size() - 1; a ++ ) {

            assertEquals(a, (int)deck.get(a));
        }
    }

    @Test
    public void testFlipShuffle() throws Exception {

        List<Integer> deck = FunctionalCardShuffle.createSortedDeck();
        List<Integer> newDeck = FunctionalCardShuffle.flipShuffle(deck);

        assertNotEquals(deck, newDeck);
    }
}