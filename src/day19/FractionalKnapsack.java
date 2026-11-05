package day19;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {

        double[] val = {60, 100, 120};
        double[] wt = {10, 20, 40};
        int capacity = 50;

        int n = val.length;
        double[][] items = new double[n][3];

        for (int i = 0; i < n; i++) {
            items[i][0] = val[i];
            items[i][1] = wt[i];
            items[i][2] = val[i] / wt[i];
        }

        Arrays.sort(items, new Comparator<double[]>() {
            @Override
            public int compare(double[] a, double[] b) {
                return Double.compare(b[2], a[2]);
            }
        });

        double totalValue = 0;
        double remaining = capacity;

        for (int i = 0; i < n; i++) {
            if (remaining <= 0) {
                break;
            }

            if (items[i][1] <= remaining) {
                totalValue += items[i][0];
                remaining -= items[i][1];
            } else {
                totalValue += items[i][2] * remaining;
                remaining = 0;
            }
        }

        System.out.printf("%.6f%n", totalValue);
    }
}