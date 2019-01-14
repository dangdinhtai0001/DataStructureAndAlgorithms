package week1;

import java.util.Arrays;

public class Example01 {
    public static void Try(int i , int n , int[] x){
        for (int j = 0; j <= 1  ; j++) {
            x[i] = j;
            if (i == n-1){
                printSolution(x);
            }else{
                Try(i+1, n , x);
            }
        }
    }

    private static void printSolution(int[]x) {
        System.out.println(Arrays.toString(x));
    }

    public static void main(String[] args) {
        int n = 4;
        int[] x = new int[n];
        Try(0 , n,x);
    }
}
