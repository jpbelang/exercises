package ca.eloas.exercises.io;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by ebeljea on 11/23/15.
 * Copyright Ericsson.
 */
public class Reader {

    public static void main2(String[] args) throws Exception {

        FileReader reader = new FileReader("/etc/passwd");
        int i = 0;
        int count = 0;
        while(i >= 0 ) {

            i = reader.read();
            if ( Character.isUpperCase(i)) {

                count ++;
            }
        }

        System.out.println(count);
    }

    public static void main1(String[] args) throws Exception {

        FileReader reader = new FileReader("/etc/passwd");
        int i = 0;
        int count = 0;
        char[] block = new char[128];
        while(i >= 0 ) {

            i = reader.read(block, 0, block.length);
            for(int a = 0; a < i; a ++) {

                if ( Character.isUpperCase(block[a])) {

                    count ++;
                }
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("/etc/fstab"));
        String s;
        while((s = br.readLine()) != null) {

            if (! s.startsWith("#") ) {
                System.out.println(s);
            }
        }
    }

}
