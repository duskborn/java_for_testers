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
    public void canAddTwoPlusTwoMinusOne() {
        int answer = 2+2-1;
        assertEquals("2+2-1=3", 3, answer);
    }

    @Test
    public void canSubTwoFromThree() {
        int answer = 3-2;
        assertEquals("3-2=1", 1, answer);
    }

    @Test
    public void canDivideSixByThree() {
        int answer = 6/3;
        assertEquals("6/3=2", 2, answer);
    }
}
