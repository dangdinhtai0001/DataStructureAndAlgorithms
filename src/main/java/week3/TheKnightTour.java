package week3;

import lombok.Getter;
import lombok.Setter;

/**
 * Mã đi tuần (hay hành trình của quân mã) là bài toán về việc di chuyển một quân mã trên bàn cờ vua (8 x 8). Quân mã
 * được đặt ở một ô trên một bàn cờ trống nó phải di chuyển theo quy tắc của cờ vua để đi qua mỗi ô trên bàn cờ đúng
 * một lần.
 */
@Getter
@Setter
public class TheKnightTour {

    int moveX[] = {-2, -2, -1, -1, 1, 1, 2, 2};
    int moveY[] = {-1, 1, -2, 2, -2, 2, -1, 1};
    int n = 5;
    int i = 0;
    int[][] a = new int[n][n];
    int u = 0;
    int v = 0;


    public void recursion(int x, int y) {
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


    private void printSolution() {
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                System.out.print(a[j][k] + "\t");
            }
            System.out.println();
        }
    }

    private boolean check(int u, int v) {
        return (u >= 0 && v >= 0 && u < n && v < n && a[u][v] == 0) == true;
    }
}
