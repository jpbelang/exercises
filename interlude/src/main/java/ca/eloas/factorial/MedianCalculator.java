package ca.eloas.factorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ebeljea on 1/18/16.
 * Copyright Ericsson.
 */
public class MedianCalculator implements MiddleCalculator {

    public double caclulate(List<Integer> integers) {

        List<Integer> sorted = new ArrayList<Integer>(integers);
        Collections.sort(sorted);
        return integers.get(sorted.size()/2);
    }
}
