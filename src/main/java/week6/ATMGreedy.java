package week6;

import java.util.Random;

public class ATMGreedy {

    private int n ;
    private int[]x;
    private int s;
    private int[] t ;
    private int count;

    public ATMGreedy() {

         n = 7;
         s = 50;

         x = new int[n];
         t = new int[n];
        create(t);

        count = 0;


    }

    @SuppressWarnings("Duplicates")
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



    private void greedy(){
        int i = 0 ;
        while (i < n){
            x[i] = s/t[i];
            s = s - x[i]* t[i];
            count += x[i];
         }
        i++;
        if(s != 0){
            System.out.println("Khong co cach doi");
        }
    }


}
