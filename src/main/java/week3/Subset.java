/**
 * Cho tập S = { 1,2,...,n}
 * Liệt kê tất cả các tập con có k phần tử của tập S
 **/
package week3;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class Subset {
    int k = 3;
    int n = 5;
    int[] result;

    public Subset() {
        result = new int[k + 1];
    }

    /**
     *
     *Vì sắp xếp theo thứ tự nên ta có :
     * result[i-1] +1 <= result[i]  (Giá trị liền trước nó sẽ bé hơn hoặc bằng chính nó )
     * result[k] <= n (Giá trị cuối cùng của mảng sẽ luôn bé hơn hoặc bằng giá trị cuối cùng của chuỗi )
     *  =>result[k-1] <= n-1
     *  =>result[k-2] <= n-2
     *  =>result[k-(k-i)] = result[i] <= n - (k-i)
     *      <=> result[i]  <= n-k+i
     *
     *  =====> result[i-1] <= result[i] <= n-k+i
     *  vì duyệt từ i - 1 nên duyệt đệ quy từ i = 1
     *
     **/
    public void recursion(int i, int[] result) {
        for (int j = result[i - 1] + 1; j <= n - k + i; j++) {
            result[i] = j;
            if (i == k)
                printSolution(result);
            else
                recursion(i + 1, result);

        }
    }

    private void printSolution(int[] result) {
        System.out.println(Arrays.toString(result));
    }

}
