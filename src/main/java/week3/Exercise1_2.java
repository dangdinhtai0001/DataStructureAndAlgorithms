/**
Cho tập S = { 1,2,...,n}
    *Liệt kê các chỉnh hợp không lặp chập k của tập S
**/
package week3;

import java.util.Arrays;

public class Exercise1_2 {
    static int k = 2;
    static int n = 4;

    public static void main(String[] args) {
        int[] result = new int[k+1];
        boolean[] b = new boolean[n+1];

        recursion(1, result , b);
    }

    /**
     * Chú ý phần mảng b có độ dài là n+1 và khoảng giá trị có thể có của j là từu 1 -> n
     */
    private static void recursion(int i, int[] result, boolean[] b) {
        for (int j = 1; j <= n ; j++) {
            if(b[j] == false){
                result[i] = j ;
                if( i == k)
                    printSolution(result);
                else{
                    b [j] = true;
                    recursion(i+1,result,b);
                    b[i] = false;
                }
            }
        }
    }

    private static void printSolution(int[] result) {
        System.out.println(Arrays.toString(result));
    }

}
