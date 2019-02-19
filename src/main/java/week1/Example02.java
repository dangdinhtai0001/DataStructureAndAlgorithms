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
    /**
     Hàm check để kiểm tra xem giá trị j có phù hợp để gán vào vị trí i hay không. Tức là x[i] = j có thỏa mãn hay ko.
     Ta thực hiện như sau:
        * Duyệt từ 0 đến i (Tức là duyệt các thành phần đã thêm vào trong mảng x[ ]).Nếu :
            * x[k] == j : Tức là trong các giá trị ở trong mảng x[i] đã trùng vs j. Hay đã có 1 hàng/cột mà khi đặt hậu
            vào thì nó sẽ bị ăn.
            * 2 TH dưới cho các đường chéo thuận và chéo nghịch
     */
}
