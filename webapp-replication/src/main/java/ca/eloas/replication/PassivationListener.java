package ca.eloas.replication;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * Created by ebeljea on 2/11/16.
 * Copyright Ericsson.
 */
public class PassivationListener implements HttpSessionActivationListener {

    public void sessionWillPassivate(HttpSessionEvent httpSessionEvent) {
        System.err.println("************************************");
        System.err.println("PPPPAAAASSSSSSIIIIIVVVVAAAATTTEEEEE*");
        System.err.println("************************************");
    }

    public void sessionDidActivate(HttpSessionEvent httpSessionEvent) {
        System.err.println("************************************");
        System.err.println("AAAACCCCTTTTIIIIIVVVVVVAAAAATTTTEEE*");
        System.err.println("************************************");
    }
}
