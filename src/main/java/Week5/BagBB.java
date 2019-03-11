package Week5;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

/**
 * có n loại đồ vật, mỗi loại có cố lượng ko hạn chế. Đồ vật loại i có khối lượng Wi và giá trị Vi 1 <= i <= n.
 * Yêu càu Chọn các đồ để đặt vào túi có giới hạn trọng lượng m, sao cho giá trị lựa chọn là cao nhất
 */

@Getter
@Setter
public class BagBB {
    // Mảng lưu trọng lượng của các vật
    private int[] weight;

    //Mảng lưu giá trị của các vật tương ứng
    private int[] cost;

    //Mảng lưu lại các nghiệm
    private int[] x;

    //Mảng lưu lại giá trị tối ưu
    private int[] solution;

    // Trọng lượng của túi
    private int m;

    //Giá trị tại thời điểm đang xét
    private int currentWeight;

    //Giá trị hiện tại của túi
    private int currentCost;

    //Để đánh giá cận
    private int g;

    //Số lượng loại đồ vật
    private int n;

    public BagBB() {

    }


    //Cập nhật lại nghiệm
    private void update() {
        for (int i = 0; i < n; i++) {
            solution[i] = x[i];
        }
    }

    //In nghiệm
    private void printSolution() {
        System.out.println(Arrays.toString(solution));
    }


    public void branchBound(int i) {


    }
}
