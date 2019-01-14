package week1;

import java.util.Arrays;

public class Example02 {
    private static void printSolution(int[] x) {
        System.out.println(Arrays.toString(x));
    }

    public static void main(String[] args) {
        int n = 4;
        int[] x = new int[n];
        Try(0, n, x);
    }

    private static void Try(int i, int n, int[] x) {
        for (int j = 0; j < n; j++) {
            if (check(i, j, x)) {
                x[i] = j;
                if (i == n - 1)
                    printSolution(x);
                else
                    Try(i + 1, n, x);
            }
        }
    }

    private static boolean check(int i, int j, int[] x) {
        for (int k = 0; k <= i; k++) {
            if (x[k] == j)
                return false;
            if (x[k] + k == j + i)
                return false;
            if (x[k] - k == j - i)
                return false;
        }
        return true;

    }
}
