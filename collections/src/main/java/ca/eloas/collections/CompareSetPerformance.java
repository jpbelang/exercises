package ca.eloas.collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by ebeljea on 11/30/15.
 * Copyright Ericsson.
 */
public class CompareSetPerformance {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new TreeSet<Integer>();

        testSet(set1);
        testSet(set2);
    }

    private static void testSet(Set<Integer> set) {


        Random r = new Random();
        for(int a = 0; a < 10000; a ++) {

            set.add(r.nextInt(2000000000));
        }

        long time = System.currentTimeMillis();
        for (int a = 0; a < 2000000; a ++ ) {

            set.contains(r.nextInt(2000000000));
        }

        System.out.println("time spent " + (System.currentTimeMillis() - time));
    }
}
