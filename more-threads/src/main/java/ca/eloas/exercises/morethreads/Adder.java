package ca.eloas.exercises.morethreads;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by ebeljea on 2/1/16.
 * Copyright Ericsson.
 */
class Adder implements Runnable {
    private final ConcurrentHashMap<String, Integer> map;

    public Adder(ConcurrentHashMap<String, Integer> map) {
        this.map = map;
    }

    public void run() {

        int total = 0;
        for (Integer tickerTotal : map.values()) {
            total += tickerTotal;
        }

        System.out.println(total);
    }
}
