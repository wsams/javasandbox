package com.wjsams.javasandbox.jodatime;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JodaTimeTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(JodaTimeTest.class);

    public JodaTimeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testJodaTime() {
        DateTime t = new DateTime();
        LOGGER.debug("Day of month: {}", t.getDayOfMonth());
        LOGGER.debug("Four months ago: {}", t.minusMonths(new Integer(4)).getMonthOfYear());

        List<String> test = null;
        Set<String> testy = new HashSet<>(test);
    }

}