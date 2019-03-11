package week6;

import java.util.Random;

public class TSPGreedy {
    private boolean[] flags;
    private int[] priority;
    private int n;
    private int[][] cost;
    private int[] x;

    public TSPGreedy() {
        n = 5;
        flags = new boolean[n];
        makeCost();
        x = new int[n];

    }

    public void greedy(int s) {

    }

    private void makeCost() {
        cost = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cost[i][j] == 0 && cost[j][i] == 0) {
                    cost[i][j] = random.nextInt(10);
                    cost[j][i] = cost[i][j];
                }
            }
        }
    }

    @SuppressWarnings("Duplicates")
    private void printCost() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(cost[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
