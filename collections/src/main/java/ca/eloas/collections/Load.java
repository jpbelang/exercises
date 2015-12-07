package ca.eloas.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Set;

/**
 * Created by ebeljea on 12/7/15.
 * Copyright Ericsson.
 */
public class Load {

    public static void load(Set<String> set, String resource) throws IOException {

        InputStream is = Load.class.getResourceAsStream(resource);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line;
        while((line = br.readLine()) != null ) {

            set.add(line);
        }
    }
}
