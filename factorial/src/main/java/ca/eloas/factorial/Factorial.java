package ca.eloas.factorial;

/**
 * Created by ebeljea on 11/2/15.
 * Copyright Ericsson.
 */
public class Factorial {

    public static int fact(int a) {

        if ( a < 0 ) {

            throw new IllegalArgumentException("fact negative is wrong!");
        }

        int cumul = 1;
        for (int i = 1; i < a + 1; i ++) {

            cumul = cumul * i;
        }

        return cumul;
    }
}
