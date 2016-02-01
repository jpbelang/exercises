package ca.eloas.exercises.morethreads;

import java.util.concurrent.*;

/**
 * Created by ebeljea on 2/1/16.
 * Copyright Ericsson.
 */
public class RunWithBarrier {

    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {

        ExecutorService exec = Executors.newFixedThreadPool(args.length + 1);
        final ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();

        CyclicBarrier cb = new CyclicBarrier(args.length + 1, new Adder(map));

        for (String arg : args) {

            exec.submit(new GetQuote(arg, map, cb));
        }

        cb.await();
    }

}
