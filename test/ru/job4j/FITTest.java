package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.FIT;

public class FITTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = FIT.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMan170Then89() {
        // Написать свой тест.
        short in = 170;
        double expected = 89;
        double out = FIT.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}