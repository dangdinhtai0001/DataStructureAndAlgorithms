package week6;

import java.util.Arrays;
import java.util.Random;

public class BagGreedy {

    private int n;
    private int m;
    private int[] x;
    private int[] weight;
    private int[] value;

    public BagGreedy() {
        n = 5;
        m = 10;
        x = new int[n];

        weight = new int[n];
        value = new int[n];
        create(weight);
        create(value);
        weight = sort(weight);
        greedy();

        System.out.println("Ket qua : "+Arrays.toString(x));
        System.out.println("Trong luong : "+ Arrays.toString(weight));
        System.out.println("Gia tri : "+ Arrays.toString(value));

    }

    public void greedy() {
        int value = Integer.MIN_VALUE;
        int i = 0;
        while (i < n) {
            if (m > 0) {
                x[i] = m / weight[i];
                m = m - x[i] * weight[i];
                value = x[i] * this.value[i];
            }
            i++;
        }
        System.out.println(value);
    }

    private int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }

    private void create(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            temp = new Random().nextInt(10);
            if (temp == 0) {
                temp = new Random().nextInt(10);
            }
            array[i] = temp;
        }
    }


}
