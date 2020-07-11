package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class StatsServiceTest {
    private static final long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSalesSum() {
        StatsService service = new StatsService();
        long expected = 180;

        long actual = service.calculateSalesSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateSalesAverage() {
        StatsService service = new StatsService();
        long expected = 15;

        long actual = service.calculateSalesAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void findSalesMax() {
        StatsService service = new StatsService();
        long expected = 20;

        long actual = service.findSalesMax(sales);
        assertEquals(expected, actual);
    }

    @Test
    void findSalesMin() {
        StatsService service = new StatsService();
        long expected = 7;

        long actual = service.findSalesMin(sales);
        assertEquals(expected, actual);
    }

    @Test
    void findElementIndex() {
        StatsService service = new StatsService();
        long element = 14;
        long expected = 10;

        long actual = service.findElementIndex(sales, element);
        assertEquals(expected, actual);
    }

    @Test
    void findSalesMaxMonthNumber() {
        StatsService service = new StatsService();
        long expected = 8;

        long actual = service.findSalesMaxMonthNumber(sales);
        assertEquals(expected, actual);
    }

    @Test
    void findSalesMinMonthNumber() {
        StatsService service = new StatsService();
        long expected = 9;

        long actual = service.findSalesMinMonthNumber(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateSalesBelowAverageMonths() {
        StatsService service = new StatsService();
        long expected = 5;

        long actual = service.calculateSalesBelowAverageMonths(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateSalesAboveAverageMonths() {
        StatsService service = new StatsService();
        long expected = 5;

        long actual = service.calculateSalesAboveAverageMonths(sales);
        assertEquals(expected, actual);
    }

}
