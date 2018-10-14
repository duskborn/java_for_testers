package com.quickmaths.smoketrees;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {

    @Test
    public void integerValueResult() {
        Integer four = new Integer(4);
        assertEquals("intValue returns int 4", 4, four.intValue());
    }

    @Test
    public void longValueAndStringParamResult() {
        Integer five = new Integer("5");
        assertEquals("longValue returns int 5", 5, five.longValue());
    }

    @Test
    public void integerValueAutoboxingResult() {
        Integer six = 6;
        assertEquals("autoboxing assignment for 6", 6, six.intValue());
    }

    @Test
    public void integerToHexStringResult() {
        Integer b = 10;
        String hex = Integer.toHexString(b);
        assertEquals("toHexString", "a", hex);
    }

    @Test
    public void integerToHexStringResult1() {
        Integer b = 11;
        String hex = Integer.toHexString(b);
        assertEquals("toHexString", "b", hex);
    }

    @Test
    public void integerToHexStringResult2() {
        Integer b = 21;
        String hex = Integer.toHexString(b);
        assertEquals("toHexString", "15", hex);
    }

    @Test
    public void integerToHexStringResult3() {
        Integer b = 3;
        String hex = Integer.toHexString(b);
        assertEquals("toHexString", "3", hex);
    }

    @Test
    public void integerParseIntResult() {
        String stringB = "11";
        assertEquals("parseInt", 11, Integer.parseInt(stringB));
    }

    @Test
    public void integerMinCheck() {
        assertEquals("Integer.MIN_VALUE is -2147483648", -2147483648, Integer.MIN_VALUE);
    }

    @Test
    public void integerMaxCheck() {
        assertEquals("Integer.MAX_VALUE is 2147483647", 2147483647, Integer.MAX_VALUE);
    }
}
