package ca.eloas.exercises.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by ebeljea on 11/30/15.
 * Copyright Ericsson.
 */
public class Routes {

    public static void main(String[] args) throws IOException, InterruptedException {

        Process p = Runtime.getRuntime().exec("netstat -rn");
        InputStream is = p.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        int count = 0;
        while( (br.readLine()) != null ) {

            count ++;
        }

        p.waitFor();
        System.out.println(count - 2);
    }
}
