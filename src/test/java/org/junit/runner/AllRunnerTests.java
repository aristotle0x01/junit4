package org.junit.runner;


import org.junit.runner.notification.AllNotificationTests;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import play.JUnitCoreTest;

@RunWith(Suite.class)
@SuiteClasses({
        AllNotificationTests.class,
        FilterFactoriesTest.class,
        FilterOptionIntegrationTest.class,
        JUnitCommandLineParseResultTest.class,
        JUnitCoreTest.class, RequestTest.class
})
public class AllRunnerTests {
}
