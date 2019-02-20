package week3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sudoku {
    private int[][] map;

    public Sudoku() {
        map = new int[9][9];
    }

    public void showMap() {
//        System.out.println("Dap an ");
        System.out.println("\n --------------------------------------");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + "\t");
                if ((j + 1) % 3 == 0 && (j + 1) != map.length)
                    System.out.print("|\t");
            }
            if ((i + 1) % 3 == 0)
                System.out.print("\n --------------------------------------");
            System.out.println();
        }
    }


    //            System.out.println("row:"+row+", col:"+col+", value:"+i+", "+check(row,col,i));

    public void Try(int row, int col) {
        map[row][col] = 0;
        for (int i = 1; i <= 9; i++) {
//            System.out.println("row:" + row + ", col:" + col + ", value:" + i + ", " + check(row, col, i));
            if (check(row, col, i)) {
                map[row][col] = i;

                if (row == 8 && col == 8) {
                    showMap();
                } else {
                    if (col == 8)
                        Try(row + 1, 0);
                    else
                        Try(row, col + 1);
                }
            }
        }
    }

    private boolean check(int row, int col, int value) {
        //Trên cùng 1 cột(col cố định,row chạy) không được có 2 giá trị giống nhau.
        for (int i = 0; i < row; i++) {
            if (map[i][col] == value)
                return false;
        }

        //Trên cùng 1 hàng(row cố định,col chạy) không được có 2 giá trị giống nhau.
        for (int i = 0; i < col; i++) {
            if (map[row][i] == value)
                return false;
        }
        int a = row / 3;
        int b = col / 3;

        for (int i = 3 * a; i <= 3 * a + 2; i++) {
            for (int j = 3 * b; j <= 3 * b + 2; j++) {
                if (map[i][j] == value && map[i][j] != 0)
                    return false;
            }
        }

        return true;
    }

}
