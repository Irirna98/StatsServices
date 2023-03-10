package ru.netology.stats;

import java.time.Month;

public class StatsService {
    public int sumSales(long[] sales) {
        int sumMonth = 0;
        for (long sale : sales) {
            sumMonth += sale;

        }
        return sumMonth;
    }

    public int averageAmount(long[] sales) {
        int minSum = 0;
        int sumMonth = 0;
        for (long sale : sales) {
            sumMonth = sumSales(sales);
            minSum = sumMonth / sales.length;


        }
        return minSum;
    }

    public int PeakSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int minimumSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lessThanAverageSales(long[] sales) {
        int lessAverageMonth = 0;
        double averageSum = PeakSales(sales);

        for (long sale : sales) {
            if (sale <= averageSum) {
                lessAverageMonth++;
            }
        }
        return lessAverageMonth;
    }

    public int aboveAverageSales(long[] sales) {
        int aboveAverageMonth = 0;
        double averageSum = PeakSales(sales);
        for (long sale : sales) {
            if (sale <= averageSum) {
                aboveAverageMonth++;

            }
        }
        return aboveAverageMonth;
    }

}
