package ca.eloas.synchro;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by ebeljea on 12/14/15.
 * Copyright Ericsson.
 */
public class SynchroError {

    static volatile int value;
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newCachedThreadPool();
        List<Future<?>> futures = new ArrayList<Future<?>>();
        for ( int t = 0; t < 10; t ++ ) {
            Future<?> f = service.submit(new Runnable() {
                public void run() {
                    for (int a = 0; a < 1000000; a++) {

                                value++;
                    }
                }
            });
            futures.add(f);
        }

        for (Future<?> future : futures) {
            future.get();
        }

        System.err.println(value + " " +  ((double)value)/100000);
        service.shutdown();
    }
}
