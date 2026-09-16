package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhiteBoxUtilsTest {

    @Test
    void testRectanglePerimeterValid() {
        assertEquals(14, WhiteBoxUtils.rectanglePerimeter(3, 4));
    }

    @Test
    void testRectanglePerimeterZero() {
        assertEquals(0, WhiteBoxUtils.rectanglePerimeter(0, 0));
    }

    @Test
    void testRectanglePerimeterInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> WhiteBoxUtils.rectanglePerimeter(-1, 4));
    }

    @Test
    void testRectangleAreaValid() {
        assertEquals(12, WhiteBoxUtils.rectangleArea(3, 4));
    }

    @Test
    void testRectangleAreaInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> WhiteBoxUtils.rectangleArea(-2, 4));
    }

    @Test
    void testQuadraticTwoRoots() {
        double[] result = WhiteBoxUtils.solveQuadratic(1, -3, 2);

        assertEquals(2, result.length);
        assertEquals(2, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void testQuadraticOneRoot() {
        double[] result = WhiteBoxUtils.solveQuadratic(1, 2, 1);

        assertEquals(1, result.length);
        assertEquals(-1, result[0]);
    }

    @Test
    void testQuadraticNoRoot() {
        double[] result = WhiteBoxUtils.solveQuadratic(1, 0, 1);

        assertEquals(0, result.length);
    }

    @Test
    void testQuadraticInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> WhiteBoxUtils.solveQuadratic(0, 2, 1));
    }

    @Test
    void test31Days() {
        assertEquals(31, WhiteBoxUtils.daysInMonth(1, 2026));
    }

    @Test
    void test30Days() {
        assertEquals(30, WhiteBoxUtils.daysInMonth(4, 2026));
    }

    @Test
    void testFebruaryNormal() {
        assertEquals(28, WhiteBoxUtils.daysInMonth(2, 2025));
    }

    @Test
    void testFebruaryLeap() {
        assertEquals(29, WhiteBoxUtils.daysInMonth(2, 2024));
    }

    @Test
    void testInvalidMonth() {
        assertThrows(IllegalArgumentException.class,
                () -> WhiteBoxUtils.daysInMonth(13, 2026));
    }

    @Test
    void testPrimeLessThan2() {
        assertFalse(WhiteBoxUtils.isPrime(1));
    }

    @Test
    void testPrime2() {
        assertTrue(WhiteBoxUtils.isPrime(2));
    }

    @Test
    void testEvenNotPrime() {
        assertFalse(WhiteBoxUtils.isPrime(4));
    }

    @Test
    void testOddPrime() {
        assertTrue(WhiteBoxUtils.isPrime(7));
    }

    @Test
    void testOddNotPrime() {
        assertFalse(WhiteBoxUtils.isPrime(9));
    }

    @Test
    void testAlternatingSumOne() {
        assertEquals(1, WhiteBoxUtils.alternatingSum(1));
    }

    @Test
    void testAlternatingSumEven() {
        assertEquals(-2, WhiteBoxUtils.alternatingSum(4));
    }

    @Test
    void testAlternatingSumOdd() {
        assertEquals(3, WhiteBoxUtils.alternatingSum(5));
    }

    @Test
    void testAlternatingSumInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> WhiteBoxUtils.alternatingSum(0));
    }

    @Test
    void testGcdNormal() {
        assertEquals(6, WhiteBoxUtils.gcd(12, 18));
    }

    @Test
    void testGcdZero() {
        assertEquals(12, WhiteBoxUtils.gcd(12, 0));
    }

    @Test
    void testGcdNegative() {
        assertEquals(6, WhiteBoxUtils.gcd(-12, 18));
    }

    @Test
    void testGcdBothZero() {
        assertThrows(IllegalArgumentException.class,
                () -> WhiteBoxUtils.gcd(0, 0));
    }

    @Test
    void testFactorialZero() {
        assertEquals(1, WhiteBoxUtils.factorial(0));
    }

    @Test
    void testFactorialNormal() {
        assertEquals(120, WhiteBoxUtils.factorial(5));
    }

    @Test
    void testFactorialInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> WhiteBoxUtils.factorial(-1));
    }

    @Test
    void testFactorialSumOne() {
        assertEquals(1, WhiteBoxUtils.factorialSum(1));
    }

    @Test
    void testFactorialSumThree() {
        assertEquals(9, WhiteBoxUtils.factorialSum(3));
    }

    @Test
    void testFactorialSumInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> WhiteBoxUtils.factorialSum(0));
    }
@Test
void testRectanglePerimeterInvalidWidth() {
    assertThrows(IllegalArgumentException.class,
            () -> WhiteBoxUtils.rectanglePerimeter(3, -1));
}

@Test
void testRectangleAreaInvalidWidth() {
    assertThrows(IllegalArgumentException.class,
            () -> WhiteBoxUtils.rectangleArea(3, -1));
}

@Test
void testInvalidMonthLower() {
    assertThrows(IllegalArgumentException.class,
            () -> WhiteBoxUtils.daysInMonth(0, 2026));
}

@Test
void testLeapYearDivisibleBy400() {
    assertEquals(29,
            WhiteBoxUtils.daysInMonth(2, 2000));
}

@Test
void testYearDivisibleBy100ButNot400() {
    assertEquals(28,
            WhiteBoxUtils.daysInMonth(2, 1900));
}

@Test
void testPrimeLoopFalseBranch() {
    assertTrue(WhiteBoxUtils.isPrime(11));
}

@Test
void testGcdFirstNumberZero() {
    assertEquals(8,
            WhiteBoxUtils.gcd(0, 8));
}

@Test
void testFactorialSumOverLimit() {
    assertThrows(IllegalArgumentException.class,
            () -> WhiteBoxUtils.factorialSum(21));
}
@Test
void testConstructor() {
    new WhiteBoxUtils();
}
}