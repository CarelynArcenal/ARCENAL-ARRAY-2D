import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArraySize size = new ArraySize();
        size.input(sc);

        DataEntry entry = new DataEntry();
        int[][] arr = entry.getElements(sc, size.rows, size.cols);

        RowSum rs = new RowSum();
        int[] rowSums = rs.compute(arr);

        ColumnSum cs = new ColumnSum();
        int[] colSums = cs.compute(arr);

        DisplayResults display = new DisplayResults();
        display.show(arr, rowSums, colSums);

        sc.close();
    }
}
