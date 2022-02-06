package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in = 5;
        int result = Factorial.calc(n);
        int expected = 100;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int result = Factorial.calc(n);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}