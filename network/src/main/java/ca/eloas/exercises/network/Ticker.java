package ca.eloas.exercises.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by ebeljea on 1/25/16.
 * Copyright Ericsson.
 */
public class Ticker {

    public static void main(String[] args) throws IOException {

        URL u = new URL("http://finance.yahoo.com/webservice/v1/symbols/"+ args[0] + "/quote?format=json&view=detail");
        URLConnection urlConnection = u.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        String line = null;
        while((line = br.readLine()) != null) {

            if ( line.contains("price")) {
                System.out.println(line);
            }
        }
    }
}
