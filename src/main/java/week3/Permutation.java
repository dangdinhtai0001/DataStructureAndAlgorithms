/**
 * Cho tập S = { 1,2,...,n}
 * Liệt kê các chỉnh hợp không lặp chập k của tập S
 **/
package week3;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class Permutation {
    int k = 2;
    int n = 4;
    int[] result;

    boolean[] b;


    public Permutation() {
        result = new int[k + 1];
        b = new boolean[n + 1];
    }

    /**
     * Chú ý phần mảng b có độ dài là n+1 và khoảng giá trị có thể có của j là từu 1 -> n
     */
    public void recursion(int i, int[] result, boolean[] b) {
        for (int j = 1; j <= n; j++) {
            if (b[j] == false) {
                result[i] = j;
                if (i == k)
                    printSolution(result);
                else {
                    b[j] = true;
                    recursion(i + 1, result, b);
                    b[i] = false;
                }
            }
        }
    }

    private void printSolution(int[] result) {
        System.out.println(Arrays.toString(result));
    }

}
