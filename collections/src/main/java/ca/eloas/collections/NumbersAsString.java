package ca.eloas.collections;

import java.io.IOException;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by ebeljea on 12/7/15.
 * Copyright Ericsson.
 */
public class NumbersAsString {

    public static void main(String[] args) throws IOException {

        Set<String> set = new TreeSet<String>(new StringNumberComparator());
        Load.load(set, "/numbers");
        System.out.println(set);
    }


    private static class StringNumberComparator implements Comparator<String> {
        public int compare(String o1, String o2) {

            if (Integer.parseInt(o1) > Integer.parseInt(o2)) {
                return 1;
            }

            if (Integer.parseInt(o1) == Integer.parseInt(o2)) {
                return 0;
            } else {
                return -1;
            }

        }
    }


}
