package org.ipredybaylo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.ipredybaylo.mathset.TaskImpl;
import java.util.HashSet;
import java.util.Set;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */



    public void testApp() throws Exception {
        TaskImpl service;

        service = new TaskImpl();
        int size = 0;
        Set<Integer> input1 = new HashSet<>();
        Set<Integer> input2 = new HashSet<>();
        Set<Integer> actual = new HashSet<>();
        Set<Integer> expected = new HashSet<>();

        for (int i = 0; i <= 5; i++) {
            input1.add(i);
            input2.add(i);
        }

        actual = service.getCross(input1, input2);
//        actual = service.getCrossStream(input1, input2);
//        actual = service.getUnion(input1, input2);
//        actual = service.getUnionStream(input1, input2);
//        size = service.getCrossSizeStream(input1, input2);

        //assertTrue(size!=0);  //test size is not 0;
        assertTrue(expected.equals(actual)); //test equals actual & expected;
    }


}
