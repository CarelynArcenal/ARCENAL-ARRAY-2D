import java.util.Scanner;
class ColumnSum {
    int[] compute(int[][] arr) {

        int[] sums = new int[arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sums[j] += arr[i][j];
            }
        }

        return sums;
    }
}
