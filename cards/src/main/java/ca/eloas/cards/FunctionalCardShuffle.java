package ca.eloas.cards;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by ebeljea on 11/15/15.
 * Copyright Ericsson.
 */
public class FunctionalCardShuffle {

    public static void main(String[] args) {

        List<Integer> deck = createSortedDeck();

        while(!properlyShuffled(deck)) {

            deck = flipShuffle(deck);
            System.out.println(deck);

        }

    }

    public static boolean properlyShuffled(List<Integer> deck) {
        // > 10 % of sequences means we did wrong.
        int countSequences = 0;
        for(int a = 0; a < deck.size() - 1; a ++ ) {

            if ( deck.get(a) + 1 == deck.get(a + 1)) {
                countSequences ++;
            }

            if ( countSequences > deck.size() / 10) {
                return false;
            }
        }

        return true;
    }

    public static List<Integer> createSortedDeck() {
        List<Integer> deck = new LinkedList<Integer>();
        for (int a = 0; a < 52; a ++) {
            deck.add(a);
        }
        return deck;
    }

    public static List<Integer> flipShuffle(List<Integer> deck) {

        // just a flip shuffle.
        int middle = deck.size() / 2;
        List<Integer> firstDeck = new LinkedList<Integer>(deck.subList(0, middle));
        List<Integer>  secondDeck = new LinkedList<Integer>(deck.subList(middle, deck.size()));
        Random r = new Random();
        List<Integer> newDeck = new LinkedList<Integer>();
        while ( firstDeck.size() != 0 || secondDeck.size() != 0) {

            if ( r.nextBoolean() == true ) {
                if (firstDeck.size() > 0) {

                    newDeck.add(firstDeck.remove(0));
                }
            } else {
                if ( secondDeck.size() > 0 ) {
                    newDeck.add(secondDeck.remove(0));
                }
            }
        }

        return newDeck;
    }
}
