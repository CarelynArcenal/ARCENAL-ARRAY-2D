import java.util.Scanner;
class RowSum {
    int[] compute(int[][] arr) {

        int[] sums = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sums[i] += arr[i][j];
            }
        }

        return sums;
    }
}
