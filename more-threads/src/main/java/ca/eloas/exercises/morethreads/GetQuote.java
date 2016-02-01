package ca.eloas.exercises.morethreads;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CyclicBarrier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ebeljea on 2/1/16.
 * Copyright Ericsson.
 */
public class GetQuote implements Callable<Void> {

    public static final Pattern QUOTES = Pattern.compile(".*:.*\"(.*)\".*");
    private final String tickerSymbol;
    private final Map<String, Integer> finished;
    private final CyclicBarrier barrier;

    public GetQuote(String tickerSymbol, Map<String, Integer> finished, CyclicBarrier barrierier) {
        this.tickerSymbol = tickerSymbol;
        this.finished = finished;
        barrier = barrierier;
    }

    public Void call() throws Exception {

        URL u = new URL("http://finance.yahoo.com/webservice/v1/symbols/"+ tickerSymbol + "/quote?format=json&view=detail");
        URLConnection urlConnection = u.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        String line = null;
        while((line = br.readLine()) != null) {

            if ( line.contains("volume")) {
                System.out.println(line);
                Matcher m = QUOTES.matcher(line);
                if ( m.matches() ) {
                    String valueString = m.group(1);
                    finished.put(tickerSymbol, Integer.parseInt(valueString));
                }
            }
        }
        barrier.await();
        return null;
    }
}
