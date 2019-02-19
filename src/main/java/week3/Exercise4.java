package week3;

public class Exercise4 {
    static int n = 1;
    public static void main(String[] args) {

    }

    static void recursion(int i , int[] r , int[] sum){
        for (int j = r[i-1]; j <= ( n - sum[i-1]/2) ; j++) {
            r[i] = j;
            sum[i] = sum[i-1] + j;
            recursion(i+1, r , sum);
        }
//        r[i] =
    }
}
