package ru.netology.stats;

public class StatsService {
    public long calculateSalesSum(long[] sales) {
        long result = 0;
        for (long monthSales : sales) {
            result += monthSales;
        }
        return result;
    }

    public long calculateSalesAverage(long[] sales) {
        return calculateSalesSum(sales) / sales.length;
    }

    public long findSalesMax(long[] sales) {
        long currentMax = sales[0];
        for (long monthSales : sales) {
            if (currentMax < monthSales) {
                currentMax = monthSales;
            }
        }
        return currentMax;
    }

    public long findSalesMin(long[] sales) {
        long currentMin = sales[0];
        for (long monthSales : sales) {
            if (currentMin > monthSales) {
                currentMin = monthSales;
            }
        }
        return currentMin;
    }

    public long findElementIndex(long[] sales, long element) {
        for (int i = 0; i < sales.length; i++) {
            if (sales[sales.length - i - 1] == element) {
                return sales.length - i - 1;
            }
        }
        return -1;
    }

    public long findSalesMaxMonthNumber(long[] sales) {
        return findElementIndex(sales, findSalesMax(sales)) + 1;
    }

    public long findSalesMinMonthNumber(long[] sales) {
        return findElementIndex(sales, findSalesMin(sales)) + 1;
    }

    public long calculateSalesBelowAverageMonths(long[] sales) {
        long average = calculateSalesAverage(sales);
        int result = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                result++;
            }
        }
        return result;
    }

    public long calculateSalesAboveAverageMonths(long[] sales) {
        long average = calculateSalesAverage(sales);
        int result = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                result++;
            }
        }
        return result;
    }

}
