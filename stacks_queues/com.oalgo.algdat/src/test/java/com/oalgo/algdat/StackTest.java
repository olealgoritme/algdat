package com.oalgo.algdat;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class StackTest extends TestCase {

    /**
     * Stack test case
     *
     * @param testName name of the test case
     */
    public StackTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(StackTest.class);
    }

    public void testStack() {
        assertTrue(true);
    }
}



