package testngdemo;

import org.testng.TestNG;

public class RunTestNG {

    public static void main(String[] args) {

        // Create TestNG object
        TestNG testng = new TestNG();

        // Tell TestNG which class to run
        testng.setTestClasses(new Class[] { FirstTestWithTestNGFramework.class });

        // Run the TestNG test
        testng.run();
    }
}