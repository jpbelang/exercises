package ca.eloas.replication;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ebeljea on 2/11/16.
 * Copyright Ericsson.
 */
public class CountingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String number = (String) req.getSession(true).getAttribute("number");
        if (number == null) {
            number = "0";
        }

        req.getSession(true).setAttribute("number", Integer.toString(Integer.parseInt(number) + 1));


        resp.setContentType("text/plain");
        resp.getOutputStream().println(number);
    }
}
