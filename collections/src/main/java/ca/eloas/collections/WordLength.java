package ca.eloas.collections;

import java.io.IOException;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by ebeljea on 12/7/15.
 * Copyright Ericsson.
 */
public class WordLength {

    public static void main(String[] args) throws IOException {

        Set<String> set = new TreeSet<String>(new StringLengthComparator());
        Load.load(set, "/wordlist");
        System.out.println(set);
    }


    private static class StringLengthComparator implements Comparator<String> {
        public int compare(String o1, String o2) {

            int a =  o1.length() - o2.length();
            if ( a != 0 ) {
                return a;
            }

            return o1.compareTo(o2);
        }
    }

}
