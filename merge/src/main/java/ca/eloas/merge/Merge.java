package ca.eloas.merge;

/**
 * Created by ebeljea on 11/2/15.
 * Copyright Ericsson.
 */
public class Merge {

    public static String[] merge(String[] one, String[] two) {

        String[] output = new String[one.length + two.length];

        int bigArrayIndex = 0;
        for(String o : one) {

            output[bigArrayIndex] = o;
            bigArrayIndex ++;
        }

        for(String o : two) {

            output[bigArrayIndex] = o;
            bigArrayIndex ++;
        }

        return output;
    }

}
