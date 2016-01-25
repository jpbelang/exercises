package ca.eloas.factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ebeljea on 1/18/16.
 * Copyright Ericsson.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> ints = new ArrayList<Integer>();

        String line;
        while ((line = br.readLine()) != null ) {

            ints.add(Integer.parseInt(line));
        }

        MiddleCalculator mc = new AverageCalculator();
        System.out.println(mc.caclulate(ints));

        mc = new MedianCalculator();
        System.out.println(mc.caclulate(ints));
    }
}
