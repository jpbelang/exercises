package ca.eloas.factorial;

import java.util.List;

/**
 * Created by ebeljea on 1/18/16.
 * Copyright Ericsson.
 */
public class AverageCalculator implements MiddleCalculator {

    public double caclulate(List<Integer> integers) {

        double sum = 0;
        for (int integer : integers) {

            sum += integer;
        }

        return sum/integers.size();
    }
}
