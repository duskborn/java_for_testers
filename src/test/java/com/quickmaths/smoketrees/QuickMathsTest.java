package com.quickmaths.smoketrees;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class QuickMathsTest {

    @Test
    public void canAddTwoPlusTwo() {
        int answer = 2+2;
        assertEquals("2+2=4", 4, answer);
    }

    @Test
    public void canAddTwoPlusThree() {
        int answer = 2+2-1;
        assertEquals("2+2-1=3", 3, answer);
    }
}
