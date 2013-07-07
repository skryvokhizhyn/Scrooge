package com.summersoft.scrooge.test;

import junit.framework.Test;
import junit.framework.TestSuite;
import android.test.suitebuilder.TestSuiteBuilder;

public class ScroogeTestSuite extends TestSuite {
    public static Test suite() {
        return new TestSuiteBuilder(ScroogeTestSuite.class).includeAllPackagesUnderHere().build();
    }
}
