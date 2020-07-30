package com.widerplanet.refactor02.after;

import com.widerplanet.refactor02.after.ComparingCondition;
import com.widerplanet.refactor02.after.Matcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatcherTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void compare_case1() {
        Matcher matcher = new Matcher();

        int[] expected = {50, 200, 3000};
        int[] actual = {50, 300, 1000};
        int clipLimit = 1000;
        int delta = 100;

        assertFalse(matcher.compareWithCondition(expected, actual, new ComparingCondition(clipLimit, delta)));

    }

    @Test
    void compare_case2() {
        Matcher matcher = new Matcher();

        int[] expected = {50, 200, 1000};
        int[] actual = {51, 250, 1050};
        int clipLimit = 1000;
        int delta = 100;

        assertTrue(matcher.compareWithCondition(expected, actual, new ComparingCondition(clipLimit, delta)));

    }
}