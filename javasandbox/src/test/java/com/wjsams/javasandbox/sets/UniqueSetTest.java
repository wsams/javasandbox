package com.wjsams.javasandbox.sets;

import java.util.HashSet;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UniqueSetTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(UniqueSetTest.class);

    public UniqueSetTest() {
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
    public void testUniqueNess() {
        Set<UniqueSet> uniqueSets = new HashSet<>();

        UniqueSet set1 = new UniqueSet("bob", "This is Text");
        uniqueSets.add(set1);

        UniqueSet set2 = new UniqueSet("sally", "stuff");
        uniqueSets.add(set2);

        UniqueSet set3 = new UniqueSet("sue", "more time");
        uniqueSets.add(set3);

        UniqueSet set4 = new UniqueSet("joe", "This is Text");
        uniqueSets.add(set4);

        assertTrue(uniqueSets.size() == 4);

        Set<String> anotherSet = new HashSet<>();
        anotherSet.add("test one");
        anotherSet.add("test two");
        anotherSet.add("Test One");
        assertTrue(anotherSet.size() == 3);
    }

    @Test
    public void testGetName() {
    }

    @Test
    public void testSetName() {
    }

    @Test
    public void testGetText() {
    }

    @Test
    public void testSetText() {
    }

    @Test
    public void testHashCode() {
    }

    @Test
    public void testEquals() {
    }

}