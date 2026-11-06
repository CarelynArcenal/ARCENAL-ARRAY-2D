import java.util.Scanner;
class DataEntry {
    int[][] getElements(Scanner sc, int rows, int cols) {

        int[][] arr = new int[rows][cols];

        System.out.println("\nEnter the array elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
          return arr;
    }
}
