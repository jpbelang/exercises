package ca.eloas.jcat;

import com.ericsson.commonlibrary.remotecli.Cli;
import com.ericsson.commonlibrary.remotecli.CliBuilder;
import com.ericsson.commonlibrary.remotecli.CliFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import se.ericsson.jcat.fw.annotations.JcatFetchLog;
import se.ericsson.jcat.fw.fetchlog.FetchLog;
import se.ericsson.jcat.fw.fetchlog.FetchLogContext;
import se.ericsson.jcat.fw.fetchlog.FetchLogHolder;
import se.ericsson.jcat.fw.fixture.testng.JcatNGSuiteListener;
import se.ericsson.jcat.fw.fixture.testng.JcatNGTestListener;
import se.ericsson.jcat.fw.fixture.testng.JcatTestMethodInterceptor;
import se.ericsson.jcat.fw.logging.JcatLoggingApi;
import se.ericsson.jcat.fw.model.JcatModelHolder;
import se.ericsson.jcat.fw.model.JcatTestCase;
import se.ericsson.jcat.fw.model.TestCaseResult;

/**
 * Created by ebeljea on 2/6/16.
 * Copyright Ericsson.
 */
public class SimpleTest {

    @Test
    public void testSomething() throws Exception {

    }
}
