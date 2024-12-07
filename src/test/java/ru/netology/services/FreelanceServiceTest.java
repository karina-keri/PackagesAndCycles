package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class FreelanceServiceTest {

    @Test
    public void testCalculateMonths() {
        FreelanceService service = new FreelanceService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int actual = service.calculate(income, expenses, threshold);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateMonths2() {
        FreelanceService service = new FreelanceService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int actual = service.calculate(income, expenses, threshold);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvFileSource( files="src/test/resources/test.csv")

    public void testWithParams (int income, int expenses, int threshold, int expected){
        FreelanceService service = new FreelanceService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
