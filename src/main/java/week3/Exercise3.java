package week3;

import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;

public class Exercise3 {

    static int moveX[] = {-2, -2, -1, -1, 1, 1, 2, 2};
    static int moveY[] = {-1, 1, -2, 2, -2, 2, -1, 1};
    static int n = 5;
    static int i = 0;
    static int[][] a = new int[n][n];
    static int u = 0;
    static int v = 0;


    public static void main(String[] args) {
        System.out.println("HEllo");
        recursion(2, 2);
    }


    private static void recursion(int x, int y) {
        i++; // tăng giá trị số bước đi
        a[x][y] = i;
        // Duyệt qua 8 nước đi có thể có của 1 con mã
        for (int j = 0; j < 8; j++) { //
            //kiểm tra xem đã đi hết bàn cờ hay chưa
            if (i == n * n) {
                System.out.println("-----------------------------------------");
                printSolution();
                //Kết thúc chương trình
            }
            //Nếu chưa đi hết bàn cờ thì tạo nước mới

            //Tạo tọa độ x mớ
            u = x + moveX[j];
            //Tạo tọa độ y mới
            v = y + moveY[j];

            // Nếu hợp lệ thì tiến hành di chuyển
            if (check(u, v)) {
//                i++;
//                a[x][y] = i;
                recursion(u, v);
            }
            //Nếu không hợp lệ thì trả tất cả về giá trị ban đầu
        }
        i--;
        a[x][y] = 0;
    }




    private static void printSolution() {
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                System.out.print(a[j][k] +"\t");
            }
            System.out.println();
        }
    }

    private static boolean check(int u, int v) {
        return (u >= 0 && v >= 0 && u < n && v < n && a[u][v] == 0) == true;
    }
}
