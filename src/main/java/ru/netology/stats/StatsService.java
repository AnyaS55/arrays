package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];

        }
        return sum;
    }

    long midSum(long[] sales) {
        return sum(sales) / 12;
    }

    int calcMaxMounthSales(long[] sales) {
        int maxMounthSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMounthSales]) {
                maxMounthSales = i;
            }
        }
        return maxMounthSales + 1;
    }

    int calcMinMounthSales(long[] sales) {
        int minMounthSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMounthSales]) {
                minMounthSales = i;
            }
        }
        return minMounthSales + 1;
    }

    int calcMonthsBelowAverage(long[] sales) {
        int counter = 0;
        long averageSale = midSum(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;

    }

    int calcMounthHigherAverege(long[] sales) {
        int counter = 0;
        long averageSale = midSum(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }


}
