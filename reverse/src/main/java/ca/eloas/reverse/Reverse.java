package ca.eloas.reverse;

/**
 * Created by ebeljea on 11/2/15.
 * Copyright Ericsson.
 */
public class Reverse {

    public static String[] reverse(String[] array) {

        String[] output = new String[array.length];
        for(int a = 0; a < output.length; a ++) {

            output[output.length - 1 - a] = array[a];
        }

        return output;
    }
}
