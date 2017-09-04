package org.ipredybaylo.mathset;

import junit.framework.Assert;;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class TaskImplTest {

    @Before
    public void setUp() throws Exception {

        }

    TaskImpl service;
    TaskImpl service2;
    Set<Integer> input1 = new HashSet<>();
    Set<Integer> input2 = new HashSet<>();
    Set<Integer> input3 = new HashSet<>();
    Set<Integer> input4 = new HashSet<>();

    @Test
    public void testGetUnion() throws Exception {

        for (int i = 0; i <= 5; i++) {
            input1.add(i);
            input2.add(i + 2);
        }
        input1.addAll(input2);

        input1.toArray();
        input2.toArray();
        Set<Integer> actual = service.getUnion(input1, input2);
        Assert.assertEquals("not union", input1, input2);
    }

    @Test
    public void testGetCross() throws Exception {

        for (int i = 0; i <= 5; i++) {
            input3.add(i);
            input4.add(i + 2);
        }
        input3.addAll(input4);

        Set<Integer> actual = service2.getCross(input3, input4);
        Assert.assertNotNull(String.valueOf(input3), actual);
    }

    public void testGetUnionStream() throws Exception {
    }

    public void testGetCrossStream() throws Exception {
    }

    public void testGetCrossSizeStream() throws Exception {
    }

}